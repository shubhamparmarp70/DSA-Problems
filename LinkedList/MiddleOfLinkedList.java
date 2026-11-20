package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class MiddleOfLinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        printList(head);
        
        System.out.println();
        System.err.println(middle(head));

    }

    /* 
    static int middle(Node head){
        if(head == null) return 0;
        int count=0;
        Node curr;
        for(curr=head;curr!=null;curr=curr.next){
             count++;
        }
        curr = head;
        for(int i=0;i<count/2;i++){
            curr = curr.next;
        }
        return curr.data;
    }
    */

    static int middle(Node head){
        if(head==null) return 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    

    static void printList(Node head){
        if(head == null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
