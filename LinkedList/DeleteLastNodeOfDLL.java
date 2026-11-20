package LinkedList;

class DNode{
    int data;
    DNode prev, next;
    DNode(int d){
        data = d;
        prev = next = null;
    }
}

public class DeleteLastNodeOfDLL {
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

        printList(head);

        head = deleteLastDLL(head);

        System.out.println();

        printList(head);
     }

     static DNode deleteLastDLL(DNode head){
        if(head==null || head.next==null){
            return null;
        }
        DNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
     }

     static void printList(DNode head){
        if(head==null) return;
        DNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
