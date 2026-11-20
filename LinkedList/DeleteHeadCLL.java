package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class DeleteHeadCLL {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next =temp2;
        temp2.next = temp3;
        temp3.next = head;

        printList(head);

        head = deleteHead(head);
        System.out.println();

        printList(head);

    }
    
    /*static Node deleteHead(Node head){
        if(head == null || head.next == head){
            return null;
        }
        Node curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = head.next;
        return head.next;
    }*/

    static Node deleteHead(Node head){
        if(head == null || head.next == head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
        
    }

    static void printList(Node head){
        if(head==null){
            return;
        }
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }while(curr!=head);
       
    }
}
