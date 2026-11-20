package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class TreeTraversalInSpiralForm {
    public static void main(String[] args){
     Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.left.left = new Node(40);
    root.left.left.left = new Node(80);
    root.left.right = new Node(50);
    root.right.left = new Node(60);
    root.right.right = new Node(70);

    System.out.println("Spiral Traversal of Tree is :");
    System.out.print(Arrays.toString(printSpiral(root)));
    }

    /*static int[] printSpiral(Node root){
        if(root==null) return null;
        ArrayList<Integer>al = new ArrayList<Integer>();
        Queue<Node>q = new LinkedList<Node>();
        Stack<Integer>st = new Stack<>();
        boolean reverse = false;
        q.add(root);
        while(q.isEmpty()==false){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(reverse){
                    st.push(curr.key);
                }else{
                    al.add(curr.key);
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
            if(reverse){
                while(st.isEmpty()==false){
                    al.add(st.pop());
                }
            }
              reverse = !reverse;
        }
      int arr[] = new int[al.size()];
      for(int i=0;i<al.size();i++){
        arr[i] = al.get(i);
      } return arr;

    }*/

    static int[] printSpiral(Node root){
        if(root==null) return null;
        ArrayList<Integer>al = new ArrayList<Integer>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node>s2 = new Stack<>();

        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node curr = s1.pop();
                al.add(curr.key);

                if(curr.left!=null){
                    s2.push(curr.left);
                }

                if(curr.right != null){
                    s2.push(curr.right);
                }
            }
            while(!s2.isEmpty()){
                Node curr = s2.pop();
                al.add(curr.key);

                if(curr.right != null)
                    s1.push(curr.right);
                if(curr.left!=null){
                    s1.push(curr.left);
                }
            }

        }
         int arr[] = new int[al.size()];
      for(int i=0;i<al.size();i++){
        arr[i] = al.get(i);
      } return arr;

    }
}
