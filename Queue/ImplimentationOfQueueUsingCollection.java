package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplimentationOfQueueUsingCollection {
    public static void main(String[] args){
        Queue<Integer>q = new ArrayDeque<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("size :" + q.size());
        System.out.println("is Empty :" + q.isEmpty());
        System.out.print(q + " ");
        System.out.println();
        System.out.println("peek element " + q.peek());
        System.out.println("poll element :" + q.poll());
        System.out.println("peek element :" + q.peek());
    }
}
