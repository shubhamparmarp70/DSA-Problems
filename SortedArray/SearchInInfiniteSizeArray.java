package SortedArray;

public class SearchInInfiniteSizeArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,23,24,25,26,27,28,29,30};
        int key = 30;
        System.out.println(search(arr,key));
    }


    /* Linear Search in Infinite Size Array */
    /* static int search(int arr[], int key){
        int i=0;
        while(true){
            if(arr[i]==key){
                return i;
            }
            if(arr[i]>key){
                break;
            }
            i++;
        }
        return -1;
    } */

        static int search(int arr[], int key){
            if(arr[0]==key){
                return 0;
            }
            int i=1;
            while(i < arr.length &&arr[i]<key){
                i=i*2;
            }
            int high = Math.min(i, arr.length - 1);
            
            return binarySearch(arr,i/2,high,key);
        }

        static int binarySearch(int arr[], int low, int high, int key){
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]<key){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return -1;
        }
   
}
