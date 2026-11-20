package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

class Node3{
    char ch;
    Node3 next;
    Node3(char c){
        ch = c;
        next = null;
    }
}
public class PalindromeLinkedList {
    public static void main(String[] args){
     Node3 head = new Node3('R');
     Node3 temp1 = new Node3('A');
     Node3 temp2 = new Node3('D');
     Node3 temp3 = new Node3('A');
     Node3 temp4 = new Node3('R');
     

    head.next = temp1;
    temp1.next = temp2;
    temp2.next = temp3;
    temp3.next = temp4;

    System.out.println(isPalindrome(head));
    }

    /*static boolean isPalindrome(Node3 head){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(Node3 curr=head;curr!=null;curr=curr.next){
            stack.push(curr.ch);
        }
        for(Node3 curr=head;curr!=null;curr=curr.next){
            if(stack.pop()!=curr.ch){
                return false;
            }
        }
        return true;
    }*/

    static boolean isPalindrome(Node3 head){
        if(head==null) return true;
        Node3 slow = head, fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node3 rev = reverseList(slow.next);
        Node3 curr = head;
        while(rev!=null){
            if(rev.ch!=curr.ch){
                return false;
            }
            rev=rev.next;
            curr=curr.next;
        }
        return true;
    }
    static Node3 reverseList(Node3 head){
        Node3 curr = head;
        Node3 prev = null;
        while(curr!=null){
            Node3 next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;

    }
}
