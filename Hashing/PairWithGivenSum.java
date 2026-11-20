package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args){
    int arr[] = {2,1,6,3};
    int sum = 6;
    System.out.println(isPairSum(arr, sum));
    }

    /*static boolean isPairSum(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }*/


    static boolean isPairSum(int arr[], int sum){
        HashSet<Integer>h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(h.contains(sum-arr[i])){
                return true;
            }else{
                h.add(arr[i]);
            }
            
        }
        return false;
    }

}
