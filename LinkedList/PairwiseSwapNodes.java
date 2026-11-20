package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class PairwiseSwapNodes {
    public static void main(String[] args){
     Node head1 = new Node(5);
     Node temp1 = new Node (8);
     Node temp2 = new Node(7);
     Node temp3 = new Node(10);
     Node temp4 = new Node(12);
     Node temp5 = new Node(13);
     Node temp6 = new Node(15);
    
    head1.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;
    temp5.next = temp6;

    printList(head1);

    head1 = pairwiseSwap(head1) ;
    System.out.println();

    printList(head1);

    }

    /*static Node pairwiseSwap(Node head){
        Node curr = head;
        while(curr!=null && curr.next!=null){
            int x = curr.data;
            curr.data = curr.next.data;
            curr.next.data = x;
            curr = curr.next.next;
        }
        return head;
    }*/


    static Node pairwiseSwap(Node head){
        if(head==null && head.next==null){
            return head;
        }
        Node curr = head.next.next;
        Node prev = head;
        head = head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }

    static void printList(Node head){
        Node  curr=head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
