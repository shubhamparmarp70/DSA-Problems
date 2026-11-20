package SortedArray;

public class IndexOfLastOccurence {
    public static void  main(String[] args){
    int arr[]= {1,2,2,2,3,4,5};
    int key = 2;
    System.out.println(LastOccurence(arr,key));
    }
    static int LastOccurence(int arr[], int key){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                if(mid==arr.length-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
