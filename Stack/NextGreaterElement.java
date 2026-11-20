package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
    int[] arr = {5,15,10,8,6,12,9,18};
    System.out.println(Arrays.toString(nextGreater(arr)));
    }
    
    /*static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    res[i]=arr[j];
                    break;
                }
            }if(j==n){
                res[i]=-1;
            }
        }
        return res;
    }*/

    static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer>s = new Stack<Integer>();
        s.push(arr[n-1]);
        res[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int nextGreat = (s.isEmpty())?-1:s.peek();
            res[i] = nextGreat;
            s.push(arr[i]);
        }
        return res;
    }
}
