package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
} 
public class RecursiveMethodtoReverseALinkedList {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    Node temp3 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;

    printList(head);

    
    head = recRevList(head,null);

    System.out.println();

    printList(head);

    }

    /*static Node recRevList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node rest_head = recRevList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }*/

    static Node recRevList(Node curr, Node prev){
        if(curr == null) return prev;
        Node next = curr.next;
        curr.next = prev;
        return recRevList(next,curr);
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}