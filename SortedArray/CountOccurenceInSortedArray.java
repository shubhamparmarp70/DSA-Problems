package SortedArray;

public class CountOccurenceInSortedArray {
    public static void main(String[] args){
        int arr[] = {1,2,2,2,3,4,5};
        int key = 6;
        System.out.println(countOccurence(arr,key));
    }

    static int countOccurence(int arr[], int key){
     int first = firstOccurence(arr,key);
     if(first==-1){
        return 0;
     }
     return lastOccurence(arr,key)-first+1;
    }

    static int firstOccurence(int arr[], int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>key){
                high=mid-1;
            }else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

     static int lastOccurence(int arr[], int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>key){
                high=mid-1;
            }else if(arr[mid]<key){
                low=mid+1;
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
