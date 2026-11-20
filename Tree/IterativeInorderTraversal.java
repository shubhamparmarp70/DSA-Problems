package Tree;

import java.util.Stack;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right=null;
    }
}
public class IterativeInorderTraversal {
    public static void main(String[] args){
    Node root = new Node(10);
     root.left = new Node(20);
     root.right = new Node(30);
     root.left.left = new Node(40);
     root.left.right = new Node(50);
     root.right.left = new Node(60);
     root.right.right = new Node(70);
     
     System.out.println("Inordert Traversal of a Tree :");
    iterativeInorder(root);
    }
    
    static void iterativeInorder(Node root){
        Stack<Node>st = new Stack<Node>();
        Node curr = root;
        while(curr!=null || st.isEmpty()==false){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }
    
}
