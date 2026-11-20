package Arrays;
public class MaxCircularSumSubArray{
    public static void main(String[] args){
    int arr[] = {10,5,-5};
    System.out.println(maxCircularSum(arr));
    }
     /* Function to find maximum sum of a circular subarray */
     /* 
     static int maxCircularSum(int arr[]){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr_sum=arr[i];
            int max_sum = arr[i];
            for(int j=1;j<arr.length;j++){
                int index=(i+j)%arr.length;
                curr_sum+=arr[index];
                max_sum=Math.max(max_sum,curr_sum);
            }
            res=Math.max(res,max_sum);
        }
        return res;
    }
    */
   
    /* Optimized approach */
    static int maxCircularSum(int arr[]){
        int  n = arr.length;
        int normal_max = kadane(arr);
        if(normal_max < 0){
            return normal_max;
        }
        int arr_sum = 0;
        for(int i=0;i<n;i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int circular_max = arr_sum + kadane(arr);
        return Math.max(normal_max,circular_max);
    }
    
    static int kadane(int arr[]){
        int max_sum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            max_sum = Math.max(max_sum+arr[i],arr[i]);
            res=Math.max(max_sum,res);
        }
        return res;
    }
}