package Recursion;

import java.util.*;

public class GenerateSubset {
    public static void main(String[] args){
        String str = "ABC";
        List<String>list = new ArrayList<>();
        subsets(str,"",0,list);
        System.out.println(list);
    }
    static void subsets(String str, String curr, int i, List<String>list){
        if(i==str.length()){
            list.add(curr);
            return;
        }
        subsets(str,curr,i+1,list);
        subsets(str,curr+str.charAt(i),i+1,list);
    }
}
