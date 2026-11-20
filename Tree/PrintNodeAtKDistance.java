package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left=right=null;
    }
}
public class PrintNodeAtKDistance {
    public static void main(String[] args){
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.right = new Node(70);

    printAtKDistance(root, 2);

    }

    static void printAtKDistance(Node root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.key + " ");
        }else{
            printAtKDistance(root.left, k-1);
            printAtKDistance(root.right, k-1);
        }
    }
}
