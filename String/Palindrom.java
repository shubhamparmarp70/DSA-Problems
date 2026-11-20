package String;

public class Palindrom {


    public static void main(String[] args){
    String str = "ABCDCBA";
    int start=0;
    int end = str.length()-1;
    System.out.println(isPalindrome(str, start,end));
    }

     // Efficient Solution
    static boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        return str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end-1);
    }

    
    // Naive Solution
    /* public static void main(String[] args){
        String str = "ABCDCBA";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }*/
    
    
}