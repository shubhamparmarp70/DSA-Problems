package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class SortedInsertInLinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        
        printList(head);

        head = sortedInsert(head,45);
        System.out.println();

        printList(head);

    }

    static Node sortedInsert(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        if(x < head.data){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static void printList(Node head){
        if(head==null) return;
        Node curr = head;
        while(curr!=null){
            System.err.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
