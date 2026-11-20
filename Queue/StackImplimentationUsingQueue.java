package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplimentationUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    // Push operation
    void push(int x) {
        q.add(x);

        // Move all previous elements behind the new element
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    // Pop operation
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q.remove();
    }

    // Peek operation
    int peek() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {

        StackImplimentationUsingQueue st = new StackImplimentationUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}