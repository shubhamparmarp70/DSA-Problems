package Stack;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedStack {

    Node head;
    int size;

    LinkedStack() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        }

        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        }

        return head.data;
    }

    int size() {
        return size;
    }

    void printStack() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class StackImplimentationUsingLinkedList {

    public static void main(String[] args) {

        LinkedStack s = new LinkedStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top Element: " + s.peek());

        System.out.println("Popped: " + s.pop());

        System.out.println("Top Element: " + s.peek());

        System.out.println("Size: " + s.size());

        System.out.print("Stack: ");
        s.printStack();

        System.out.println("Is Empty: " + s.isEmpty());
    }
}

