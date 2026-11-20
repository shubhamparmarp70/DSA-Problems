package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class DetectAndRemoveLoopFromLinkedList {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(15);
    Node temp2 = new Node(20);
    Node temp3 = new Node(25);
    Node temp4 = new Node(30);
    Node temp5 = new Node(35);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;
     
    detectAndRemoveLoop(head);

    printList(head);
    }

    static void detectAndRemoveLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                break;
            }
        }
        if(slow!=fast) return;
        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
