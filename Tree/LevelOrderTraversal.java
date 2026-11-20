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
        left=right=null;
    }
}
public class LevelOrderTraversal {
    public static void main(String[] args){
        
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.right = new Node(70);

    System.out.println("Level order Traversal of a tree :");
    System.out.println(Arrays.toString(levelOrderTraversal(root)));
    }

    static int[] levelOrderTraversal(Node root){
        if(root==null) return null;
        ArrayList<Integer>al = new ArrayList<Integer>();
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr = q.poll();
            al.add(curr.key);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}
