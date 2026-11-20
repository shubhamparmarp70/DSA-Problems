package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class SearchInLinkedList {
    public static void main(String[] args){
        Node head  = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next= temp2;
        temp2.next = temp3;

        System.out.println(searchInList(head,40));
    }

    /* // Iterative Solution
    static int searchInList(Node head, int x ){
        Node curr = head;
        int pos=1;
        while(curr != null){
            if(curr.data==x){
               return pos;
            }
            curr = curr.next;
            pos++;
        }
        return -1;
    } 
    */

    // Recursive Solution
    static int searchInList(Node head, int x){
        if(head==null) return -1;
        if(head.data == x) return 1;
        else{
            int res = searchInList(head.next, x);
        
        if(res==-1) return -1;
        else{
            return res+1;
        }
    }
        

    }


    
}
