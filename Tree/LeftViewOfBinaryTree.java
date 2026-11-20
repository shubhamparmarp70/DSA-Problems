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
public class LeftViewOfBinaryTree {
    public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.out.println("Left view of binary tree is :");
    System.out.print(Arrays.toString(leftView(root)));
    }

    static int[] leftView(Node root){
    if(root==null) return null;
    ArrayList<Integer>al = new ArrayList<>();
    Queue<Node>q = new LinkedList<Node>();
    q.add(root);
    while(q.isEmpty()==false){
        int count = q.size();
        for(int i=0;i<count;i++){
            Node curr = q.poll();
            if(i==0){
                al.add(curr.key);
            }
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    int[] arr = new int[al.size()];
    for(int i=0;i<al.size();i++){
        arr[i] = al.get(i);
    } 
    return arr;
    }
}
