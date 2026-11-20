package BitwiseOperators;

import java.util.Scanner;

public class BitwiseNOT {
        public static void main(String[] args){
        
        /* Bitwise NOT operation for signed Integer
        System.out.print("Enter a number to perform bitwise NOT operation: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        System.out.println("Bitwise Not of " + num1 + " is: " + (~num1 ));
*/
       /* Bitwise Not for unsigned Integer */
      System.out.print("Enter a number to perform bitwise NOT operation: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        System.out.println("Bitwise Not of " + num1 + " is: " + Integer.toUnsignedString(~num1));
      
        

    }
}
