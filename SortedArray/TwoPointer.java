package SortedArray;

public class TwoPointer {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 18;
        System.out.println(isPairSum(arr,target));
    }

    /* 
    static boolean isPairSum(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }*/
   static boolean isPairSum(int arr[], int target){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        if(arr[i]+arr[j]==target){
            return true;
        }else if(arr[i]+arr[j]<target){
            i++;
        }else{
            j--;
        }
    }
    return false;
   }

}
