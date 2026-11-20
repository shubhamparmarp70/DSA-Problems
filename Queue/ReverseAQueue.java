package Queue;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {
    public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Original Queue: " + q);

        reverse(q);

        System.out.println("Reversed Queue: " + q);
    }

    // Iterative 
    /*static void reverse(Queue<Integer>q){
        Stack<Integer>s = new Stack<Integer>();
        while(q.isEmpty()==false){
            s.push(q.remove());
        }

        while(s.isEmpty()==false){
            q.add(s.pop());
        }
    }*/

    // Recursive
    static void reverse(Queue<Integer>q){
        if(q.isEmpty()) return;
        
        int x = q.remove();
        reverse (q);
        q.add(x);
    }
}
