package Arrays;

public class MaximumDifference {
    public static void main(String[] args){
    int arr[] = {2,3,10,6,4,8,1};
    System.out.println(maxDifference(arr));
    }

    /* 
     static int maxDifference(int arr[]){
         int n=arr.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return arr[0];
        }
        int res=arr[1]-arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
    */

    static int maxDifference(int arr[]){
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res,arr[i]-minVal);
            minVal = Math.min(minVal,arr[i]);
        }
        return res;
    }

   
}
