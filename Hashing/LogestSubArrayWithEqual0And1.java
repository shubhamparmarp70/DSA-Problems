package Hashing;

import java.util.HashMap;

public class LogestSubArrayWithEqual0And1 {
    public static void main(String[] args){
    int arr[] = {1,1,1,1};
    System.out.println(maxZeroOne(arr));
    }

    /* 
    static int maxZeroOne(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int c0=0,c1=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    c0++;
                }
                else{
                    c1++;
                }
                if(c0==c1){
                    res = Math.max(res,c0+c1);
                }
            }
        }
        return res;

    }
    */

    static int maxZeroOne(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
           
        }
        int res =  longestSubArray(arr,0);
        return res; 

    }
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
