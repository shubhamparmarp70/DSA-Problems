package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left=right=null;
    }
}
public class NodesInCompleteBinaryTree {
    public static void main(String[] args){
     Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.right = new Node(70);

    System.out.print("Nodes in Complete Binary tree is : ");
    System.out.print(countNodes(root));
    }

    /*static int countNodes(Node root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }*/

    static int countNodes(Node root){
        int lh = 0, rh = 0;
        Node curr = root;
        while(curr!=null){
            lh++;
            curr = curr.left;
        }
        curr = root;
        while(curr!=null){
            rh++;
            curr = curr.right;
        }
        if(lh==rh) return ((int)Math.pow(2, lh)) - 1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    
}
