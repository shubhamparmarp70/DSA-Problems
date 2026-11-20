package Tree;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        this.key = k;
        left = right = null;
    }
}

public class BinaryTreeToDLL {

    Node prev = null;
    Node head = null;

    // Convert Binary Tree to Doubly Linked List
    Node bToDLL(Node root) {
        inorder(root);
        return head;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);

        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }

        prev = root;

        inorder(root.right);
    }

    // Print Doubly Linked List
    void printDLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key);
            if (curr.right != null)
                System.out.print(" <-> ");
            curr = curr.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        BinaryTreeToDLL tree = new BinaryTreeToDLL();

        /*
                  10
                 /  \
               12    15
              / \    /
            25  30  36
        */

        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        // Convert to DLL
        Node head = tree.bToDLL(root);

        // Print DLL
        System.out.println("Doubly Linked List:");
        tree.printDLL(head);
    }
}