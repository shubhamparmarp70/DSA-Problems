package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
    System.out.println("Enter Number : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Sum of the Digits of a number " + num + " is : " + sumOfDigits(num));
    }


    /* Recursive */
    /*
     static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    */ 

    /* Iterative */
    static int sumOfDigits(int n){
        int res=0;
        while(n>0){
            res+=n%10;
            n=n/10;
        }
        return res;
    }
   
}
