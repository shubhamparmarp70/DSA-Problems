package Deque;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;
public class DequeInJava {
    public static void main(String[] args){
        Deque<Integer>d = new LinkedList<>();
        // This functions doesn't shows any exception if we perform offer fnction on fully Dequeue and poll function on empty Deque.
        /*d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        d.pollFirst();
        d.pollLast();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    */

     // This functions shows  exception if we perform add fnction on fully Dequeue and remove function on empty Deque.
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        d.removeFirst();
        d.removeLast();

        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        /*Iterator it = d.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();*/

        for(int x:d){
            System.out.print(x+" ");
        }
        System.out.println();

        Iterator it = d.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
}
}
