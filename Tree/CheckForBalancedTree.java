package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right =null;
    }
}
public class CheckForBalancedTree {
    public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.out.println(isBalanced(root));
    }

    static boolean isBalanced(Node root){
        if(root==null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+height(root.left)+height(root.right);
    }
}
