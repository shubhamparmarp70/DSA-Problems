package SortedArray;

public class IndexOfFirstOccuring {
    public static void main(String[] args){
        int arr[] = {1,2,2,2,3,4,5};
        int key = 2;
        System.out.println(firstOccurence(arr,0, arr.length-1, key));
    }
    
    /* Naive Approach */
    /*static int firstOccurence(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }*/

    /* Optimized Approach */
    static int firstOccurence(int arr[], int low, int high,int key){
       if(low>high){
        return -1;
       }
       int mid=(low+high)/2;
       if(arr[mid]>key){
        return firstOccurence(arr, low, mid-1, key);
       }
       else if(arr[mid]<key){
        return firstOccurence(arr, mid+1, high, key);
       }
       else{
        if(mid==0 || arr[mid-1]!=arr[mid]){
            return mid;
        }
            else{
                return firstOccurence(arr,low,mid-1,key);
            }
        
       }
    }
}
