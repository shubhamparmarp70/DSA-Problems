package Stack;

import java.util.Stack;

public class InfixToPostfix {

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

    // Convert Infix to Postfix
    static String infixToPostfix(String infix) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {

            char ch = infix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }

            // Left Parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }

            // Right Parenthesis
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }

                stack.pop(); // Remove '('
            }

            // Operator
            else {

                while (!stack.isEmpty() &&
                        precedence(stack.peek()) >= precedence(ch)) {

                    // Handle right associativity of ^
                    if (ch == '^' && stack.peek() == '^')
                        break;

                    postfix.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {

        String infix = "(A+B)*C";

        System.out.println("Infix   : " + infix);
        System.out.println("Postfix : " + infixToPostfix(infix));
    }
}
