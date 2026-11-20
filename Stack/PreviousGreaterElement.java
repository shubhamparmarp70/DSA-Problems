package Stack;

import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args){
    int[] arr = {15,10,18,12,4,6,2,8};
    System.out.println(Arrays.toString(previousGreater(arr)));
    }

    /*static int[] previousGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        for(int i=1;i<n;i++){
            int j;
          for( j=i-1;j>=0;j--){
            if(arr[j]>arr[i]){
                res[i] = arr[j];
                 break;
            }
               
          }
          if(j==-1){
            res[i]=-1;
          }
          
        }
        return res;
    }*/

    static int[] previousGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        Stack<Integer>s = new Stack<Integer>();
        s.push(arr[0]);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int prevGreat = (s.isEmpty())?-1:s.peek();
            res[i] = prevGreat;
            s.push(arr[i]);
        }
        return res;

    }
}
