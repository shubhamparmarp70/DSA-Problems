package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right = null;
    }
}
public class DiameterOfBinaryTree {
    public static void main(String[] args){
     Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.err.print("Diameter of given binary tree is : ");
    System.out.print(diameter(root));
    }

    /*static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    static int diameter(Node root){
        if(root==null) return 0;
        int d1 = 1+height(root.left)+height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);

        return Math.max(d1, Math.max(d2,d3));
    }*/
    static int res = 0;

    // Returns height and updates diameter
    static int height(Node root) {

        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        // Update maximum diameter
        res = Math.max(res, lh + rh + 1);

        // Return height
        return 1 + Math.max(lh, rh);
    }

    static int diameter(Node root) {
        res = 0;
        height(root);
        return res;
    }
}
