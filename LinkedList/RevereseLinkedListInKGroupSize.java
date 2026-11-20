package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data =d;
        next =null;
    }
}
public class RevereseLinkedListInKGroupSize {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(15);
    Node temp2 = new Node(20);
    Node temp3 = new Node(25);
    Node temp4 = new Node(30);
    Node temp5 = new Node(35);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;

    printList(head);

    head = reverseGroupSizeK(head, 2);
    System.out.println();

    printList(head);
    }

    /* Recursive Solution */
    /*static Node reverseGroupSizeK(Node head, int k){
     Node curr = head, next =null, prev = null;
     int count = 0;
     while(curr!=null && count<k){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
     }
     if(next!=null){
        Node rest_head = reverseGroupSizeK(next, k);
        head.next = rest_head;
     }
     return prev;
    }*/

    // Iterative Solution
    static Node reverseGroupSizeK(Node head, int k){
       Node curr = head, prevFirst = null;
       boolean isFirstPass = true;
       while(curr!=null){
        Node first = curr, prev = null;
        int count = 0;
        while(curr!=null && count<k){
            Node next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr=next;
            count++;
        }
        if(isFirstPass){
            head = prev;
            isFirstPass = false;
        }else{
            prevFirst.next = prev;
            
        }
            prevFirst = first;
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
