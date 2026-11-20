package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right = null;
    }
}
public class ChildrenSum {
    public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(8);
    root.right = new Node(2);
    root.right.left = new Node(2);

    System.out.println(isChildrenSum(root));
    }

    static boolean isChildrenSum(Node root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        int sum=0;
        if(root.left!=null){
            sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (root.key==sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }
}
