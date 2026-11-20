package Arrays;

public class MaxLenEvenOddSubArray {
    public static void main(String[] args){
    int arr[] = {10,12,14,7,8};
    System.out.println(maxLenEvenOdd( arr));
    }

    /* static int maxLenEvenOdd(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            int curr=1;
            for(int j=i;j<arr.length;j++){
              if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0){
                curr++;
              }
              else{
                break;
              }
            }res=Math.max(res,curr);
        }
        return res;
    }
    */

    static int maxLenEvenOdd(int arr[]){
        int res=1;
        int curr=1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0){
            curr++;
            res=Math.max(res,curr);
           }
           else{
            curr=1;
           }
        }
        return res;
    }
    
}
