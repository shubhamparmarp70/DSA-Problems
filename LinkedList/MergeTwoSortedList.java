package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class MergeTwoSortedList {
    public static void main(String[] args){
     Node head1 = new Node(5);
     Node temp11 = new Node (7);
     Node temp12 = new Node(8);
     Node temp13 = new Node(10);
     Node temp14 = new Node(12);
     Node temp15 = new Node(13);
     Node temp16 = new Node(15);
    
    head1.next = temp11;
    temp11.next = temp12;
    temp12.next = temp13;
    temp13.next = temp14;
    temp14.next = temp15;
    temp15.next = temp16;

    Node head2 = new Node(4);
    Node temp21 = new Node(9);
    Node temp22 = new Node(11);
    Node temp23 = new Node(19);
    Node temp24 = new Node(24);
    Node temp25 = new Node(37);
    
    head2.next = temp21;
    temp21.next = temp22;
    temp22.next = temp23;
    temp23.next = temp24;
    temp24.next = temp25;
    
    Node head = sortedMerge(head1, head2);
    printList(head);

    }
    static Node sortedMerge(Node head1, Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;

        Node head = null, tail = null;
        if(head1.data<=head2.data){
            head=tail=head1;
            head1=head1.next;
        }else{
            head=tail=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                tail.next = head1;
                tail = head1;
                head1=head1.next;
            }else{
                tail.next=head2;
                tail = head2;
                head2 = head2.next;
            }
        }
        if(head1==null){
            tail.next=head2;
        }else{
            tail.next = head1;
        }
        return head;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }
}
