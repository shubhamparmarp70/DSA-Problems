package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class RemoveDuplicatesFromSortedLL {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(20);
    Node temp3 = new Node(30);
    Node temp4 = new Node(40);
    Node temp5 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;

    printList(head);
    
    head = removeDuplicates(head);
    System.out.println();

    printList(head);
    }

    static Node removeDuplicates(Node head){
        Node curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

static void printList(Node head){
    Node curr = head;
    while(curr!=null){
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
}
}
