package SortedArray;

public class SearchInSortedRotatedArray {
    public static void main(String[] args){
    int arr[] = {4,5,6,7,0,1,2};
    int key = 2;
    System.out.println(search(arr,key));
    }
    /* Linear Search in Sorted Rotated Array */
    /*static int search(int arr[], int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
        
    }
    return -1;
}*/

    static int search(int arr[], int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<arr[mid]){
                    high=mid-1;

                }else{
                    low=mid+1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
