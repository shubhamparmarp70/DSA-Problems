package Hashing;

import java.util.HashMap;


public class LongestCommanSubArraywithGivenArrays {
    public static void main(String[] args){
    int arr1[] = {1,1,1,1,0,0,0,1};
    int arr2[] = {0,0,0,0,1,1,1,1};
    System.out.println(longestCommonSum(arr1, arr2));
    }

    /*static int longestCommonSum(int arr1[], int arr2[]){
      int res=0;
      for(int i=0;i<arr1.length;i++){
        int sum1=0, sum2=0;
        for(int j=i;j<arr1.length;j++){
            sum1+=arr1[j];
            sum2+=arr2[j];

            if(sum1==sum2){
                res = Math.max(res,j-i+1);
            }
        }
      }
      return res;
    }*/


    static int longestCommonSum(int arr1[], int arr2[]){
        int temp[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            temp[i] = arr1[i]-arr2[i];
        }

        int res = longestSubArrayWithGivenSum(temp,0);
        return res;
    }

    static int longestSubArrayWithGivenSum(int arr[], int sum){
        HashMap<Integer,Integer>m = new HashMap<Integer,Integer>();
        int res=0;
        int pre_sum = 0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(m.containsKey(pre_sum)==false){
               m.put(pre_sum,i);
            }

            if(m.containsKey(pre_sum - sum)){
                res = Math.max(res,i-m.get(pre_sum - sum));
            }
        }
        return res;
    }
}
