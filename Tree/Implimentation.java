package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class Implimentation {
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        traversal(root);
    }
    static void traversal(Node root){
        if(root!=null){
            traversal(root.left);
            System.out.print(root.key + " ");
            traversal(root.right);
        }
    }
}
