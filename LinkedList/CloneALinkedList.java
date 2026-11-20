package LinkedList;

import java.util.HashMap;

class Node1 {
    int data;
    Node1 next;
    Node1 random;

    Node1(int data) {
        this.data = data;
        next = null;
        random = null;
    }
}

public class CloneALinkedList {

    static Node1 clone(Node1 head) {

        if (head == null)
            return null;

        HashMap<Node1, Node1> map = new HashMap<>();

        Node1 curr = head;

        // Step 1: Create clone of every node
        while (curr != null) {
            map.put(curr, new Node1(curr.data));
            curr = curr.next;
        }

        // Step 2: Set next and random pointers
        curr = head;

        while (curr != null) {
            Node1 cloneNode = map.get(curr);

            cloneNode.next = map.get(curr.next);
            cloneNode.random = map.get(curr.random);

            curr = curr.next;
        }

        return map.get(head);
    }

    static void print(Node1 head) {
        Node1 curr = head;

        while (curr != null) {
            System.out.print("Data = " + curr.data);

            if (curr.random != null)
                System.out.print(", Random = " + curr.random.data);
            else
                System.out.print(", Random = null");

            System.out.println();

            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);

        // Random pointers
        head.random = head.next.next;      // 10 -> 30
        head.next.random = head;           // 20 -> 10
        head.next.next.random = head.next.next.next; // 30 -> 40
        head.next.next.next.random = head.next; // 40 -> 20

        System.out.println("Original List:");
        print(head);

        Node1 cloneHead = clone(head);

        System.out.println("\nCloned List:");
        print(cloneHead);
    }
}
