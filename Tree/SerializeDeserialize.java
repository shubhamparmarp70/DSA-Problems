package Tree;

import java.util.*;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class SerializeDeserialize {

    // Serialize Tree
    static ArrayList<Integer> serialize(Node root) {

        ArrayList<Integer> arr = new ArrayList<>();

        if (root == null)
            return arr;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            Node curr = q.poll();

            if (curr == null) {
                arr.add(-1);
                continue;
            }

            arr.add(curr.key);

            q.offer(curr.left);
            q.offer(curr.right);
        }

        return arr;
    }

    // Deserialize Tree
    static Node deserialize(ArrayList<Integer> arr) {

        if (arr.size() == 0)
            return null;

        Node root = new Node(arr.get(0));

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.size()) {

            Node curr = q.poll();

            // Left Child
            if (arr.get(i) != -1) {
                curr.left = new Node(arr.get(i));
                q.offer(curr.left);
            }
            i++;

            // Right Child
            if (i < arr.size() && arr.get(i) != -1) {
                curr.right = new Node(arr.get(i));
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                10
               /  \
             20    30
                  /  \
                 40   50
        */

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        // Serialize
        ArrayList<Integer> arr = serialize(root);

        System.out.println("Serialized Tree:");
        System.out.println(arr);

        // Deserialize
        Node newRoot = deserialize(arr);

        System.out.print("Inorder Traversal: ");
        inorder(newRoot);
    }
}