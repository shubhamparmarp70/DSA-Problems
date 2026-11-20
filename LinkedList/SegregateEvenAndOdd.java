package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class SegregateEvenAndOdd {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(15);
    Node temp2 = new Node(13);
    Node temp3 = new Node(30);
    Node temp4 = new Node(27);
    Node temp5 = new Node(4);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;

    printList(head);

    head = segregateEvenOdd(head);
    System.out.println();

    printList(head);
    }

    static Node segregateEvenOdd(Node head){
        Node es = null, ee=null, os=null, oe = null;
        for(Node curr = head; curr!=null; curr = curr.next){
            int x = curr.data;
            if(x%2==0){
                if(es==null){
                    es=ee=curr;
                }else{
                    ee.next = curr;
                    ee=curr;
                }
            }else{
                if(os==null){
                    os=oe=curr;
                }else{
                    oe.next=curr;
                    oe = curr;
                }
            }
        }if(os==null || es==null){
            return head;
        }
        ee.next=os;
        oe.next = null;
        return es;
    }
    static void printList(Node head){
        Node curr  = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
