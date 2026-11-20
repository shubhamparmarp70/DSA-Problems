package Stack;

import java.util.Stack;

public class PrefixToInfix {

    static String prefixToInfix(String prefix) {

        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }

            // Operator
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String exp = "(" + op1 + ch + op2 + ")";

                stack.push(exp);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String prefix = "*+ABC";

        System.out.println("Prefix : " + prefix);
        System.out.println("Infix  : " + prefixToInfix(prefix));
    }
}