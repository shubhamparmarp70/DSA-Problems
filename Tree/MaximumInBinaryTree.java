package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left=right=null;
    }
}
public class MaximumInBinaryTree {
    public static void main(String[] args){
     Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.out.println("Maximum element in binary tree is :");
    System.out.print(maximum(root));
    }

    static int maximum(Node root){
        if(root==null) return -1;
        else{
            return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
        }
    }
}
