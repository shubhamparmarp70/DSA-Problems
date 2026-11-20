package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class IntersectionPointOfTwoLinkedList {
    public static void main(String[] args){
     Node head1 = new Node(5);
     Node temp1 = new Node (8);
     Node temp2 = new Node(7);
     Node temp3 = new Node(10);
     Node temp4 = new Node(12);
     Node temp5 = new Node(12);
     Node temp6 = new Node(15);
    
    head1.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;
    temp5.next = temp6;

    Node head2 = new Node(9);
    head2.next = temp4;
    
    System.out.println(printCommon(head1, head2));

    }
    static int printCommon(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        int count1=0;
        int count2=0;
        while(curr1!=null){
            curr1=curr1.next;
            count1++;
        }
        while(curr2!=null){
            curr2 = curr2.next;
            count2++;
        }
        int x,y;
        if(count1>count2){
             x = count1-count2;
            curr1 = head1;
            curr2 = head2;
            for(int i=0;i<x;i++){
              curr1=curr1.next;
            }
            while(curr1!=null && curr2!=null){
                if(curr1.data == curr2.data){
                    return curr1.data;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }return -1;
        }else{
            y = count2-count1;

            curr1 = head1;
            curr2 = head2;
            for(int i=0;i<y;i++){
              curr2=curr2.next;
            }
            while(curr1!=null && curr2!=null){
                if(curr1.data == curr2.data){
                    return curr1.data;
                }
                curr1=curr1.next;
                curr2=curr2.next;
            }return -1;
        }

    }
    
}
