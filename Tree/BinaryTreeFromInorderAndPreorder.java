package Tree;

/* Recursive Solution */
/*import java.util.HashMap;

class Node1 {
    char data;
    Node1 left, right;

    Node1(char d) {
        data = d;
        left = right = null;
    }
}

public class BinaryTreeFromInorderAndPreorder {

    static int preIndex = 0;
    static HashMap<Character, Integer> map = new HashMap<>();

    static Node1 buildTree(char[] inorder, char[] preorder,
                          int inStart, int inEnd) {

        if (inStart > inEnd)
            return null;

        // Root is the current preorder element
        char rootValue = preorder[preIndex++];
        Node1 root = new Node1(rootValue);

        // If no children
        if (inStart == inEnd)
            return root;

        int inIndex = map.get(rootValue);

        root.left = buildTree(inorder, preorder, inStart, inIndex - 1);
        root.right = buildTree(inorder, preorder, inIndex + 1, inEnd);

        return root;
    }

    static void printPostorder(Node1 root) {
        if (root == null)
            return;

        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        char[] inorder = {'D','B','E','A','F','C'};
        char[] preorder = {'A','B','D','E','C','F'};

        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        Node1 root = buildTree(inorder, preorder, 0, inorder.length - 1);

        System.out.print("Postorder Traversal: ");
        printPostorder(root);
    }
}*/

// iterative solution
import java.util.Stack;

class Node1 {
    char data;
    Node1 left, right;

    Node1(char data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeFromInorderAndPreorder {

    static Node1 buildTree(char[] inorder, char[] preorder) {

        if (preorder.length == 0)
            return null;

        Stack<Node1> stack = new Stack<>();

        Node1 root = new Node1(preorder[0]);
        stack.push(root);

        int inIndex = 0;

        for (int preIndex = 1; preIndex < preorder.length; preIndex++) {

            Node1 node = stack.peek();

            if (node.data != inorder[inIndex]) {
                node.left = new Node1(preorder[preIndex]);
                stack.push(node.left);
            } else {

                while (!stack.isEmpty() &&
                        stack.peek().data == inorder[inIndex]) {
                    node = stack.pop();
                    inIndex++;
                }

                node.right = new Node1(preorder[preIndex]);
                stack.push(node.right);
            }
        }

        return root;
    }

    static void postOrder(Node1 root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        char[] inorder = {'D', 'B', 'E', 'A', 'F', 'C'};
        char[] preorder = {'A', 'B', 'D', 'E', 'C', 'F'};

        Node1 root = buildTree(inorder, preorder);

        System.out.print("Postorder: ");
        postOrder(root);
    }
}
