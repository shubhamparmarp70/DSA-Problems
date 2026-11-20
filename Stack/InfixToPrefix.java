package Stack;

import java.util.Stack;

public class InfixToPrefix {

    // Returns precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // Reverse the expression and swap brackets
    static String reverse(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }

        return sb.toString();
    }

    // Convert Infix to Prefix
    static String infixToPrefix(String infix) {

        String rev = reverse(infix);

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < rev.length(); i++) {

            char ch = rev.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // Left parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }

            // Right parenthesis
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            }

            // Operator
            else {
                while (!stack.isEmpty()
                        && precedence(stack.peek()) > precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        // Reverse postfix to get prefix
        return reverse(postfix.toString());
    }

    public static void main(String[] args) {

        String infix = "(A+B)*C";

        System.out.println("Infix  : " + infix);
        System.out.println("Prefix : " + infixToPrefix(infix));
    }
}