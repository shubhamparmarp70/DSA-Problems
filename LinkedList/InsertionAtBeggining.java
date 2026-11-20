package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class InsertionAtBeggining {
    public static void main(String[] args){
       Node head = new Node(10);
       Node temp1 = new Node(20);
       Node temp2 = new Node(30);
       head.next = temp1;
       temp1.next = temp2;

       printList(head);
       head = insertBegin(head);
       System.err.println();
       printList(head);
    }

    static Node insertBegin(Node head){
        Node curr = new Node(30);
        if(head == null){
            return curr;
        }
        curr.next = head;
        return curr;
    }

    static void printList(Node head){
        if(head==null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
