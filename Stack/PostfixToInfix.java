package Stack;

import java.util.Stack;

public class PostfixToInfix {

    // Convert Postfix to Infix
    static String postfixToInfix(String postfix) {

        Stack<String> stack = new Stack<>();

        // Traverse from left to right
        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }

            // Operator
            else {
                String op2 = stack.pop();
                String op1 = stack.pop();

                String exp = "(" + op1 + ch + op2 + ")";

                stack.push(exp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String postfix = "AB+C*";

        System.out.println("Postfix : " + postfix);
        System.out.println("Infix   : " + postfixToInfix(postfix));
    }
}