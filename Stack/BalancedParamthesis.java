package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParamthesis {
    public static void main(String[] args){
    String str = "{}([())])";
    System.out.println(isBalanced(str));
    }
    static boolean matching(char a, char b){
        return ((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']') );
    }

    static boolean isBalanced(String str){
        Deque<Character>s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                s.push(x);
            }else{
                if(s.isEmpty()==true)
                    return false;
                else if(matching(s.peek(),x)==false)
                    return false;
                else
                    s.pop();
            }
        }
        return s.isEmpty()==true;
    }
}
