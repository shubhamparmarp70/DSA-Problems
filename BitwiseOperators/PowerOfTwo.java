package BitwiseOperators;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
     System.out.println("Enter a number to check that is power of Two or not : ");
     Scanner sc = new Scanner(System.in);
     int num  = sc.nextInt();
     System.out.print("Is this Number " + num + " is power of two : " + isPowerOfTwo(num));
    }
    /*
    static boolean isPowerOfTwo(int n){
            if(n==0){
                return false;
            }
            while(n!=1){
                if(n%2==1){
                    return false;
                }
                n=n/2;
            }
            return true;
        } 
    */

    static boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        int count=0;
        while(n>0){
            n = n&(n-1);
            count = count+1;        
        }

        if(count==1){
            return true;
        }
        return false;
    }

    
}
