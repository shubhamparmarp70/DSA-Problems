package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right = null;
    }
}
public class MaximumWidthOfBinaryTree {
    public static void main(String[] args){
     Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.out.println("The maximum width of given tree is :");
    System.out.print(maxWidth(root));
    }

    static int maxWidth(Node root){
        if(root==null) return 0;
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false){
            int count  = q.size();
            res = Math.max(res, count);
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return res;
    }
}
