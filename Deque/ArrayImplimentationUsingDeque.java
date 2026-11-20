package Deque;

class Deque1{
    int size, cap;
    int[] arr;
    Deque1(int c){
        cap = c;
        size = 0;
        arr = new  int[cap];
    }

    boolean isFull(){
        return size==cap;
    }

    boolean isEmpty(){
        return size==0;
    }

    void insertRear(int x){
        if(isFull()) return;
        arr[size]=x;
        size++;
    }

    void deleteRear(){
        if(isEmpty()) return;
        size--;
    }

    int getRear(){
        if(isEmpty()) return -1;
        return arr[size];
    }

    void insertFront(int x){
        if(isFull()) return;
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=x;
        size++;
    }

    void deleteFront(){
        if(isEmpty()) return;
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    int getFront(){
        if(isEmpty()) return -1;
        return arr[0];
    }

    void printDeque(){
        if(isEmpty()) return;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ArrayImplimentationUsingDeque {
    public static void main(String[] args){
    Deque1 d = new Deque1(10);
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
