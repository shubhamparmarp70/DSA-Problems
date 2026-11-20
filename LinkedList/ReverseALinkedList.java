package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
} 
public class ReverseALinkedList {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    Node temp3 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;

    printList(head);
    
    head = reverseLinkedList(head);

    System.out.println();

    printList(head);

    }

    /*static Node reverseLinkedList(Node head){
        ArrayList<Integer>arr = new ArrayList<Integer>();
        for(Node curr = head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            curr.data = arr.remove(arr.size()-1);
        }
        return head;
    }*/

    static Node reverseLinkedList(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;
    }

    static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
