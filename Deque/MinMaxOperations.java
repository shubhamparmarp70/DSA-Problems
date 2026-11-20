package Deque;

import java.util.LinkedList;
import java.util.Deque;
class MyDS{
    Deque<Integer>dq;
    MyDS(){
        dq = new LinkedList<Integer>();
    }

    void insertMin(int x){
        dq.offerFirst(x);
    }

    void insertMax(int x){
        dq.offerLast(x);
    }

    int getMin(){
        return dq.peekFirst();
    }

    int getMax(){
        return dq.peekLast();
    }

    int extractMin(){
        return dq.pollFirst();
    }

    int extractMax(){
        return dq.pollLast();
    }
}
public class MinMaxOperations {
    public static void main(String[] args){
        MyDS dq = new MyDS();
        dq.insertMin(5);
        dq.insertMax(10);
        dq.insertMin(3);
        dq.insertMax(15);
        dq.insertMin(2);

        System.out.println(dq.extractMin());
        System.out.println(dq.extractMax());

        dq.insertMin(1);
        System.out.println(dq.extractMin());

        dq.insertMax(20);
        System.out.println(dq.extractMax());
            
        
    }
}
