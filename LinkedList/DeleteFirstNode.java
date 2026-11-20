package LinkedList;

class Node{
    int  data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class DeleteFirstNode {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    Node temp3 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;

    printList(head);

    head = deleteFirstNode(head);

    System.out.println();

    printList(head);
    }
    static Node deleteFirstNode(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    static void printList(Node head){
        if(head==null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
