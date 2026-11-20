package LinkedList;

import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class DetectLoop {
    public static void main(String[] args){
    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(20);
    Node temp3 = new Node(30);
    Node temp4 = new Node(40);
    Node temp5 = new Node(40);
    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;
    temp4.next = temp5;
    temp5.next = temp3;

    System.out.println(isLoop(head));
    }
    
    /*static boolean isLoop(Node head){
        Node temp = new Node(0);
        Node curr = head;
        while(curr!=null){
            if(curr.next==null){
                return false;
            }
            if(curr.next == temp){
                return true;
            }
            Node curr_next = curr.next;
            curr.next = temp;
            curr = curr_next;
        }
        return false;
    }*/

    /*static boolean isLoop(Node head){
        HashSet<Node>h = new HashSet<Node>();
        for(Node curr=head;curr!=null;curr=curr.next){
          if(h.contains(curr)){
            return true;
          }
          h.add(curr);
        }
        return false;
    }*/

    static boolean isLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
