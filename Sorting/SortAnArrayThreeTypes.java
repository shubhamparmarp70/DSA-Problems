package Sorting;

import java.util.Arrays;

public class SortAnArrayThreeTypes {
    public static void main(String[] args){
    int arr[] = {0,1,0,2,1,2};
    sortArrayIn3Way(arr);
    System.out.println(Arrays.toString(arr));
    }

    /* static int[] sortArrayIn3Way(int arr[]){
        int temp[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                temp[j]=0;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                temp[j]=1;
                j++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                temp[j]=2;
                j++;
            }
        }

        return temp;
    }
    */
   
    /* Dutch National Flag Algorithm */
    static void sortArrayIn3Way(int arr[]){
        int l=0;
        int mid=0;
        int h = arr.length-1;
        while(mid<=h){
            if(arr[mid]==0){
                int temp = arr[l];
                arr[l]=arr[mid];
                arr[mid]=temp;
                l++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        
    }
    
}
