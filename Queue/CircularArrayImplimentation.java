package Queue;

class Queue1{
    int[] arr;
    int cap,size,front;
    Queue1(int c){
        cap=c;
        size=0;
        front=0;
        arr = new int[cap];
    }

    boolean isFull(){
        return cap==size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getFront(){
        if(isEmpty()) return -1;
        return front;
    }

    int getRear(){
        if(isEmpty()) return -1;
        return (front+size-1)%cap;
    }

    void enque(int x){
        if(isFull())  return ;
        int rear = getRear();
        rear = (rear+1)%cap;
        arr[rear] = x;
        size++;
    }

    void deque(){
        if(isEmpty()) return;
        front = (front+1)%cap;
        size--;
    }

    void printQueue(){
        if(isEmpty()) return;
        for(int i=front; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class CircularArrayImplimentation {
    public static void main(String[] args) {
        Queue1 q = new Queue1(10);

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);

        q.printQueue();

        System.out.println("front = " + q.getFront());
        System.out.println("Rear = " + q.getRear());
        q.deque();

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.printQueue();
    }
}
