package SortedArray;

public class TripletInSortedArray {
    public static void main(String[] args){
     int arr[] = {1,2,4,5,6,8,9};
     int target = 23;
    System.out.println(tripletInSortedArray(arr,target));  
        
    }

    /* This method checks if there exists a triplet in the sorted array that sums up to the target */
    /*static boolean tripletInSortedArray(int arr[], int target){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return true;
                    }
                }
            }
        }
        return false;
    }*/

    static boolean tripletInSortedArray(int arr[], int target){
        for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==target){
                    return true;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return false;
    }

    
}
