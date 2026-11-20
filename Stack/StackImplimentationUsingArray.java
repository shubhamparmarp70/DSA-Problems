package Stack;

class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplimentationUsingArray {
    public static void main(String[] args) {

        MyStack s = new MyStack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.printStack();

        System.out.println("Pop = " + s.pop());
        System.out.println("Peek = " + s.peek());

        s.printStack();
    }
}