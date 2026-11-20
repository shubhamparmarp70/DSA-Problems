package Deque;

class Deque{
    int[] arr;
    int front, cap, size;
    Deque(int c){
        cap = c;
        size=0;
        front=0;
        arr = new int[cap];
    }

    boolean isEmpty(){
        return size==0;
    }

    boolean isFull(){
        return size==cap;
    }

    void deleteFront(){
        if(isEmpty()) return;
        front = (front+1)%cap;
        size--;
    }

    void insertRear(int x){
        if(isFull()) return;
        int new_rear = (front+size)%cap;
        arr[new_rear] = x;
        size++;
    }

    int getFront(){
        if(isEmpty()) return -1;
        return arr[front];
    }

    void insertFront(int x){
     if(isFull()) return;
     front = (front+cap-1)%cap;
     arr[front] = x;
     size++;
    }

    void deleteRear(){
        if(isEmpty()) return;
        size--;
    }

    int getRear(){
    if(isEmpty()) return -1;
    return arr[(front+size-1)%cap];
    }

    void printDeque(){
        if(isEmpty()) return;
        for(int i=0;i<size;i++){
            System.out.print(arr[(front + i) % cap]+" ");
        }
        System.out.println();
    } 
}
public class EfficientArrayImplimentation {
    public static void main(String[] args) {
        Deque d = new Deque(10);
        d.insertFront(10);
        d.insertFront(20);
        d.insertRear(30);
        d.insertRear(40);
        d.insertFront(50);
        d.printDeque();
        d.deleteFront();
        d.printDeque();
        d.deleteRear();
        d.printDeque();
    }
}

