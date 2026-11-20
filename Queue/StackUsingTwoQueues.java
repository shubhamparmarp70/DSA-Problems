package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {
        q1.add(x);
    }

    // Pop operation
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int ans = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    // Peek operation
    int peek() {
        if (q1.isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int ans = q1.peek();
        q2.add(q1.remove());

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        StackUsingTwoQueues st = new StackUsingTwoQueues();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}