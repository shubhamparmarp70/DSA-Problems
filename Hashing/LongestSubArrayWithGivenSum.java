package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args){
    int arr[] = {3,1,0,1,8,2,3,6};
    int sum = 5;
    System.out.println(longestSubArray(arr, sum));
    }


    /*static int longestSubArray(int arr[], int sum){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr+=arr[j];
                if(curr==sum){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }*/

    static int longestSubArray(int arr[], int sum){
        HashMap<Integer,Integer>m = new HashMap<Integer, Integer>();
        int pre_sum = 0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum == sum){
                 res = i+1;
            }
            if(m.containsKey(pre_sum)==false){
                m.put(pre_sum,i);
            }
            if(m.containsKey(pre_sum-sum)){
                res= Math.max(res,i-m.get(pre_sum-sum));
            }
        }
        return res;
    }
}
