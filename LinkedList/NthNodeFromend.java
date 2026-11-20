package LinkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class NthNodeFromend {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    Node temp3 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;

    findNthNodeFromend(head, 3);
    }

    /* 
    static void findNthNodeFromend(Node head, int k){
        int len = 0;
        Node curr;
        for(curr = head;curr!=null;curr=curr.next){
            len++;
        }
        if(len<k){
            return;
        }
        curr = head;
        for(int i=1;i<len-k+1;i++){
            curr = curr.next;
        }
        return System.out.println(curr.data);
    }
    */

    static void findNthNodeFromend(Node head, int k){
        if(head==null) return ;
        Node first = head;
        for(int i=0;i<k;i++){
            if(first==null) return;
            first = first.next;
        }
        Node second = head;
        while(first!=null){
            second = second.next;
            first=first.next;
        }

        System.out.println(second.data);
        
    }
    
}
