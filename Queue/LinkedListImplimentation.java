package Queue;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class Queue2{
    Node front,rear;
    int size;
    Queue2(){
        front=rear=null;
        size=0;
    }

    void enqueue(int x){
        Node temp = new Node(x);
        size++;
        if(front==null){
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }

    void deque(){
        if(front==null) return;
        size--;
        front=front.next;
        if(front==null) rear = null;
    }

    void printQueue(){
        Node curr;
        for(curr=front;curr!=null;curr=curr.next){
            System.out.print(curr.data+" ");
        }
        System.out.println();
    }
}
public class LinkedListImplimentation {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue();

        q.deque();

        q.printQueue();
    }
}
