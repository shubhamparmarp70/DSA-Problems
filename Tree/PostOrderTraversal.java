package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left=right=null;
    }
}

public class PostOrderTraversal {
    public static void main(String[] args){
     Node root = new Node(10);
     root.left = new Node(20);
     root.right = new Node(30);
     root.left.left = new Node(40);
     root.left.right = new Node(50);
     root.right.left = new Node(60);
     root.right.right = new Node(70);
     
     System.out.println("Inordert Traversal of a Tree :");
     postorderTraversal(root);
    }

    static void postorderTraversal(Node root){
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }
}
