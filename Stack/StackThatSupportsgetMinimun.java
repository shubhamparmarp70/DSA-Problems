package Stack;

import java.util.Stack;

/*class MinStack{
    Stack<Integer>stack;
    Stack<Integer>minStack;

    MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);
        }
    }

    int pop(){
        if(stack.isEmpty())
            return -1;
        int x = stack.pop();
        if(x==minStack.peek()){
            minStack.pop();
        }
        return x;
    }

    int peeK(){
        if(stack.isEmpty())
            return -1;
        return stack.peek();
    }

    int getMin(){
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}*/

class MinStack{
    Stack<Integer>stack;
    int min;
    MinStack(){
        stack = new Stack<>();
    }

    void push(int x){
        if(stack.isEmpty()){
            stack.push(x);
            min=x;
        }
        else if(x>=min){
            stack.push(x);
        }
        else{
            stack.push(2*x-min);
            min = x;
        }
    }

    int pop(){
        if(stack.isEmpty()) return -1;
        int x = stack.pop();
        if(x>=min){
            return x;
        }
        int actual = min;
        min = 2*min - x;
        return actual;
    }

    int peek(){
        if(stack.isEmpty()){
            return -1;
        }
        int t = stack.peek();
        if(t>=min){
            return t;
        }
        return min;
    }

    int getMin(){
        if(stack.isEmpty()) return -1;
        return min;
    }
}
public class StackThatSupportsgetMinimun {
    public static void main(String[] args){
     MinStack st = new MinStack();

        st.push(5);
        st.push(10);
        st.push(2);
        st.push(1);
        st.push(7);

        System.out.println("Minimum = " + st.getMin());

        st.pop();

        System.out.println("Minimum = " + st.getMin());

        st.pop();

        System.out.println("Minimum = " + st.getMin());
    }
}
