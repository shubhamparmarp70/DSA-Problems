package Recursion;
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       System.out.println("Input String " + str + " isPalindrom ? : "+ isPalindrome(str, 0, str.length()-1)) ;

    }
    static boolean isPalindrome(String s, int start, int end){
          if(start>=end){
            return true;
          }
          return (s.charAt(start)==s.charAt(end)) && isPalindrome(s, start+1, end-1);
    }
}
