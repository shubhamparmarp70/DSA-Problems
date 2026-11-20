package LinkedList;

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

public class CloneNodeEfficient {

    static Node1 clone(Node1 head) {
     Node1 curr = head;
     while(curr!=null){
        Node1 next = curr.next;
        curr.next = new Node1(curr.data);
        curr.next.next = next;
        curr=next;
     }

     for(curr = head; curr!=null;curr=curr.next.next){
        curr.next.random = (curr.random == null)?null:curr.random.next;
     }
     Node1 head2 = head.next;
     Node1 clone = head2;
     for(curr=head;curr!=null;curr=curr.next){
        curr.next = curr.next.next;
        clone.next = (clone.next != null) ? clone.next.next : null;
        clone = clone.next;

     }
     return head2;
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
