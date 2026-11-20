package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class CircularLinkedList {
     public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = head;

        printList(head);
     } 

     /*
     static void printList(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        Node curr = head;
        for(curr=head.next;curr!=head;curr=curr.next){
            System.out.print(curr.data + " ");
        }
     }*/

    static void printList(Node head){
        if(head==null) return;
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }while(curr!=head);
    }
}
