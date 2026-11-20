package Tree;

import java.util.ArrayList;

class Node {
    int key;
    Node left, right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

public class LowestCommonAncestor {

    
    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca(root, 4, 5);

        if (ans != null)
            System.out.println("LCA = " + ans.key);
        else
            System.out.println("Node not found");
    }

    /*static boolean findPath(Node root, ArrayList<Node> path, int n) {

        if (root == null)
            return false;

        path.add(root);

        if (root.key == n)
            return true;

        if (findPath(root.left, path, n) ||
            findPath(root.right, path, n))
            return true;

        path.remove(path.size() - 1);

        return false;
    }

    static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!findPath(root, path1, n1) ||
            !findPath(root, path2, n2))
            return null;

        int i = 0;

        while (i < path1.size() &&
               i < path2.size() &&
               path1.get(i) == path2.get(i)) {
            i++;
        }

        return path1.get(i - 1);
    }*/

    static Node lca(Node root, int n1, int n2){
        if(root==null) return null;
        if(root.key==n1 || root.key==n2) return root;
        Node lca1 = lca(root.left,n1,n2);
        Node lca2 = lca(root.right, n1, n2);

        if(lca1!=null && lca2!=null) return root;
        if(lca1!=null) return lca1;
        else return lca2;
    }

}