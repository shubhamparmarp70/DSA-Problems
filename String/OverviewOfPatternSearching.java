package String;

import java.util.ArrayList;
import java.util.Arrays;

public class OverviewOfPatternSearching {
    public static void main(String[] args){
    String txt = "ABCABCDABCD";
    String pat = "ABCD";
    System.out.println(Arrays.toString(patSearching(txt, pat)));
    }
    
    // Naive Solution
    /*static int[] patSearching(String txt, String pat){
      int m = pat.length();
      int n = txt.length();
      ArrayList<Integer>al = new ArrayList<Integer>();
      for(int i=0;i<=n-m;i++){
        int j;
        for( j=0;j<m;j++){
            if(pat.charAt(j)!=txt.charAt(i+j)){
                break;
            }
           
            }
             if(j==m){
               al.add(i);
        }
      }
      int[] ans = new int[al.size()];
      for(int i=0;i<al.size();i++){
        ans[i] = al.get(i);
      }
      return ans;
    }*/
    
    // Improved Naive Solution for Distinct characters
    static int[] patSearching(String txt, String pat){
      int n = txt.length();
      int m = pat.length();

      ArrayList<Integer>al = new ArrayList<Integer>();
      for(int i=0;i<=n-m;){
        int j;
        for( j=0;j<m;j++){
          if(pat.charAt(j)!=txt.charAt(i+j)){
              break;
          }
        } if (j==m){
          al.add(i);
        }
        if(j==0){
          i++;
        }else{
          i = (i+j);
        }
      }
      int ans[] = new int[al.size()];
      for(int i=0;i<al.size();i++){
        ans[i] = al.get(i);
      }
      return ans;
    }

}
