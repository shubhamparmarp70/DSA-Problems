package SortedArray;

public class Count1sInSortedArray {
    public static void main(String[] args){
        int arr[] = {0,0,0,0,0,1};
        System.out.println(count1s(arr));
    }

    static int count1s(int arr[]){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return arr.length-mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return 0;
    }
}
