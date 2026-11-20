package Stack;

import java.util.Stack;

public class EvaluationOfPrefix {

    // Evaluate Prefix Expression
    static int evaluatePrefix(String prefix) {

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {

            char ch = prefix.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // Operator
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;

                    case '-':
                        stack.push(op1 - op2);
                        break;

                    case '*':
                        stack.push(op1 * op2);
                        break;

                    case '/':
                        stack.push(op1 / op2);
                        break;

                    case '^':
                        stack.push((int) Math.pow(op1, op2));
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String prefix = "-+2*319";

        System.out.println("Prefix Expression : " + prefix);
        System.out.println("Result : " + evaluatePrefix(prefix));
    }
}
