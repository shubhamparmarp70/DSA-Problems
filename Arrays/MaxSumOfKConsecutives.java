package Arrays;

public class MaxSumOfKConsecutives {
    public static void main(String[] args){
        int arr[] = {10,5,-2,20,1};
        int k=3;
        System.out.println(maxSumOfKConsecutives(arr,k));
    }

    /**
     * Finds the maximum sum of k consecutive elements in an array.
     * @param arr The input array.
     * @param k The number of consecutive elements to consider.
     * @return The maximum sum of k consecutive elements.
     */
    /* 
     static int maxSumOfKConsecutives(int arr[], int k){
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k+1;i++){
            int curr_sum=0;
            for(int j=0;j<k;j++){
                curr_sum+=arr[i+j];
            }
            res=Math.max(res,curr_sum);
        }
         return res;
    }
    */
    
    /* Optimized Approach */
    static int maxSumOfKConsecutives(int arr[], int k){
        int curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        int res=curr_sum;
        for(int i=k;i<arr.length;i++){
            curr_sum=curr_sum+arr[i]-arr[i-k];
            res=Math.max(res,curr_sum);
        }
        return res;
    }
   
}
