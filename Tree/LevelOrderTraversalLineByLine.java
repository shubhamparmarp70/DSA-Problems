package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right = null;
    }
}
public class LevelOrderTraversalLineByLine {
    public static void main(String[] args){
    
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.right = new Node(70);
    
    System.out.println("Level order Traversal of a tree :");
    levelOrderTraversalLineByLine(root);

    }
    
    /*static void levelOrderTraversalLineByLine(Node root){
        if(root==null) return ;
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr = q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }*/

    static void levelOrderTraversalLineByLine(Node root){
        if(root==null) return;
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                System.out.print(curr.key + " ");
             if(curr.left!=null) q.add(curr.left);
             if(curr.right!=null) q.add(curr.right);
            }
            System.out.println();
        }
    }
}
