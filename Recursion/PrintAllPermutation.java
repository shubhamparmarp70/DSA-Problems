package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {
    public static void main(String[] args){
    String s = "ABCD";
    List<String>list = new ArrayList<>();
    allStringPermutations(s, 0, list);
    System.out.println(list);

}
    static void allStringPermutations(String s, int i, List<String> list){
       if(i == s.length() - 1){
           list.add(s);
           return;
       }
       for(int j = i; j < s.length(); j++){
           char[] chars = s.toCharArray();
           // swap
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            String swapped = new String(chars);

            allStringPermutations(swapped, i + 1, list);
       }
    }
}
