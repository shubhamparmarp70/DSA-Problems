package Recursion;

public class SubSetSum {
    public static void main(String[] args){
        int arr[] = {10,20,15};
        int n= arr.length;
        int sum = 0;
        System.out.print("Count of subset sum is : " + subSetSumCount(arr, n,  sum));
    }
    static int subSetSumCount(int arr[],int n, int sum){
        if(n==0){
            return sum==0?1:0;
        }
        return subSetSumCount(arr,n-1,sum)+subSetSumCount(arr,n-1,sum-arr[n-1]);
    }
}
