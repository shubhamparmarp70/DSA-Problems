package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args){
    int[] arr = {13,15,12,14,16,8,6,4,10,30};
    System.out.println(Arrays.toString(printSpan(arr)));
    }

    /*static int[] printSpan(int arr[]){
        int n = arr.length;
        int res[]= new int[n];
        for(int i=0;i<n;i++){
            int span =1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){
                span++;
            }
            res[i]=span;
        }
        return res;
    }*/

    static int[] printSpan(int arr[]){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        res[0] = 1;
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
           int  span = s.isEmpty()?i+1:i-s.peek();
           res[i] = span;
           s.push(i);
        }
        return res;

    }
    
}
