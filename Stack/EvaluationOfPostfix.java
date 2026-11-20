package Stack;

import java.util.Stack;

public class EvaluationOfPostfix {

    // Evaluate Postfix Expression
    static int evaluatePostfix(String postfix) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            char ch = postfix.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            // Operator
            else {
                int op2 = stack.pop();
                int op1 = stack.pop();

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

        String postfix = "231*+9-";

        System.out.println("Postfix Expression : " + postfix);
        System.out.println("Result : " + evaluatePostfix(postfix));
    }
}