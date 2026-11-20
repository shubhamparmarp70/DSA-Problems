package Deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
public class MaxInSubArrayKSize {
    public static void main(String[] args){
    int[] arr = {10,8,5,12,15,7,6};
    System.out.println(Arrays.toString(printMaxk(arr, 3)));
    }

    /*static int[] printMaxk(int arr[], int k){
        int n = arr.length;
        int res[] = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int max = arr[i];
            for(int j=i+1;j<i+k;j++){
                max = Math.max(arr[j], max);
            }
            res[i]=max;
        }
        return res;
    }*/

    static int[] printMaxk(int arr[], int k){
        int n = arr.length;
        int res[] = new int[n-k+1];
        int j=-1;
        Deque<Integer>dq = new LinkedList<Integer>();
        for(int i=0;i<k;i++){
        while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            dq.removeLast();
        dq.addLast(i);
        }
        for(int i=k;i<n;i++){
         res[++j] = arr[dq.peek()];
         while(!dq.isEmpty() && dq.peek()<=i-k)
            dq.removeFirst();
        while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()])
            dq.removeLast();
        dq.addLast(i);
        }
        res[++j]=arr[dq.peek()];
        return res;
        
    }
}


