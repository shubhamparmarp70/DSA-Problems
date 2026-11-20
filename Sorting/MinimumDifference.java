package Sorting;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args){
    int arr[] = {10,8,1,4};
    System.out.println(minDifference(arr));
    }
    /* 
    static int minDifference(int arr[]){
        int res=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                res = Math.min(res, Math.abs(arr[i]-arr[j]));
            }
        }
         return res;
    }
    */

    static int minDifference(int arr[]){
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            res = Math.min(res,Math.abs(arr[i]-arr[i-1]));
        }
        return res;
    }
    
}
