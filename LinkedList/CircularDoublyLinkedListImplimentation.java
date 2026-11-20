package LinkedList;

class DNode{
    int data;
    DNode prev,next;
    DNode(int d){
        data = d;
        prev=next = null;
    }
}
public class CircularDoublyLinkedListImplimentation {
    public static void main(String[] args){
        DNode head = new DNode(10);
        DNode temp1 = new DNode(20);
        DNode temp2 = new DNode(30);
        DNode temp3 = new DNode(40);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = temp3;
        temp3.prev = temp2;
        temp3.next = head;
        head.prev = temp3;

        printList(head);
    }

    static void printList(DNode head){
        if(head == null) return;
        DNode curr = head;
         do {
             System.out.print(curr.data+" ");
             curr = curr.next;
        }while(curr!=head);
    }
}
