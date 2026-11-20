package Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args){
        int arr[] = {1,4,20,3,10,5};
        int sum = 33;
        System.out.println(subArrayWithGivenSum(arr,sum));
    }
    
    /* Brute Force Approach */
    /* 
    static boolean subArrayWithGivenSum(int arr[], int sum){
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
    }
    */
    
    /* Sliding Window Approach */
    static boolean subArrayWithGivenSum(int arr[], int sum){
        int curr_sum=0;
        int s=0;
        for(int  i=0;i<arr.length;i++){
            curr_sum+=arr[i];
        while(sum<curr_sum){
          curr_sum-=arr[s];
          s++;
        }
        if(curr_sum==sum){
            return true;
        }
    }
        
        return false;
    }
    
}
