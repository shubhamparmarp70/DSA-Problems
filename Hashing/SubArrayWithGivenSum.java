package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args){
    int arr[] = {5,8,6,13,3,-1};
    int sum = 22;
    System.out.println(isSubArraywithSum(arr,sum));
    }
    
    
    /*static boolean isSubArraywithSum(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    return true;
                }
            }
        }
        return false;
    }*/

    
    static boolean isSubArraywithSum(int arr[], int sum){
        HashSet<Integer>h = new HashSet<Integer>();
        int pre_sum = 0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum){
                return true;
            }
            if(h.contains(pre_sum-sum)){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
}
