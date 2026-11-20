package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left=right=null;
    }
}

public class PreOrderTreeTraversal {
     public static void main(String[] args){
     Node root = new Node(10);
     root.left = new Node(20);
     root.right = new Node(30);
     root.left.left = new Node(40);
     root.left.right = new Node(50);
     root.right.left = new Node(60);
     root.right.right = new Node(70);
     
     System.out.println("Inordert Traversal of a Tree :");
     preorderTraversal(root);
    }

    static void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.key + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}
