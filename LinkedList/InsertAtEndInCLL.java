package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class InsertAtEndInCLL {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = head;

        printList(head);

        head = insertEnd(head,50);
        System.out.println();

        printList(head);
    }

    /*static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head==null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next!=head){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next=head;
        return head;
    }*/

    static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int y = temp.data;
        temp.data = head.data;
        head.data = y;
        return temp;
    }

    static void printList(Node head){
        if(head==null) return;
        Node curr = head;
        do{
            System.out.print(curr.data + " ");
            curr = curr.next;
        }while(curr!=head);
    }


}
