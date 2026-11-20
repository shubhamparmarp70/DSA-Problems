package Queue;

class Queue{
    int size, cap;
    int[] arr;
    Queue(int c){
        cap=c;
        size=0;
        arr=new int[cap];
    }

    boolean isFull(){
        return size==cap;
    }

    boolean isEmpty(){
        return size==0;
    }

    void enque(int x){
        if(isFull()) return;
        arr[size] = x;
        size++;
    }
    
    void deque(){
        if(isEmpty()) return;
        for(int i=0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    int getFront(){
        if(isEmpty()) return -1;
        return arr[0];
    }

    int getLast(){
        if(isEmpty()) return -1;
        return arr[size-1];
    }

    void printQueue(){
        if(size==0) return;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ImplimentationUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);

        q.printQueue();

        System.out.println("front = " + q.getFront());
        System.out.println("Rear = " + q.getLast());
        q.deque();

        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.printQueue();
    }
}

