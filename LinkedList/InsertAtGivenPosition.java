package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class InsertAtGivenPosition {
    public static void main(String[] args){
      Node head = new Node(10);
      Node temp1 = new Node(20);
      Node temp2 = new Node(30);
      Node temp3 = new Node(40);
      Node temp4 = new Node(60);
      head.next = temp1;
      temp1.next = temp2;
      temp2.next = temp3;
      temp3.next = temp4;

      printList(head);

      head = insertAtPosition( head, 50, 4);

      System.out.println();

      printList(head);
    }
    static Node insertAtPosition(Node head, int x, int pos){
        Node  temp = new Node(x);
        if (pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i=1;i<=pos-2;i++){
            curr=curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
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
