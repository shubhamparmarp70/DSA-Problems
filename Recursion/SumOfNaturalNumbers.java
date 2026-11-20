package Recursion;
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " Natural numbers is " + sumOfNNumbers( n));

    }
    static int sumOfNNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNNumbers(n-1);
    }
}
