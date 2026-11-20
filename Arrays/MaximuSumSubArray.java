package Arrays;

public class MaximuSumSubArray {
    public static void main(String[] args){
    int arr[] = {2,3,-8,7,-1,2,3};
    System.out.println(maxSubArraySum(arr));
    }


    /* static int maxSubArraySum(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr = 0;
            for(int j=i;j<arr.length;j++){
                curr+=arr[j];
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    */
    
    /* Kadan's Algorithm */
    static int maxSubArraySum(int arr[]){
        int max_sum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            max_sum = Math.max(max_sum+arr[i],arr[i]);
            res=Math.max(max_sum,res);
        }
        return res;
    }
}
