package BitwiseOperators;

import java.util.Scanner;

public class BitwiseOR {
        public static void main(String[] args){
        System.out.print("Enter two numbers to perform bitwise OR operation: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + (num1 | num2));
    }
}
