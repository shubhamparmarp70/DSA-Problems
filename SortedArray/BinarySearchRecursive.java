package SortedArray;

public class BinarySearchRecursive {
    public static void main(String[] args){
        int arr[] = {2,3,4,10,40};
        int key = 2;
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,key));
    }

    /* Binary Search Implementation Recursive */
    static int binarySearchRecursive(int arr[], int low, int high, int key){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return binarySearchRecursive(arr,low,mid-1,key);
        }
        else{
            return binarySearchRecursive(arr,mid+1,high,key);
        }
    }
}
