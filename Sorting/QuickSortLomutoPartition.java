package Sorting;

import java.util.Arrays;

public class QuickSortLomutoPartition {
    public static void main(String[] args){
    int arr[] = {8,4,7,9,3,10,5};
    int l=0;
    int h=arr.length-1;
    quickSort(arr, l,h);
     System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int l, int h){
        if(l<h){
            int p = partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
       
    }

    static int  partition(int arr[], int l, int h){
        int p = arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<p){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
}
