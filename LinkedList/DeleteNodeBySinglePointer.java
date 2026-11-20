package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class DeleteNodeBySinglePointer {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(25);
    Node temp3 = new Node(30);
    Node temp4 = new Node(40);
    Node temp5 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;

    printList(head);

    deleteNode(temp3);
    System.out.println();

    printList(head);

    }

    static void deleteNode(Node ptr){
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
