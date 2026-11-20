package Sorting;

import java.util.Arrays;

public class QuickSortHoaresPartiton {
    public static void main(String[] args){
    int arr[] = {8,4,7,9,3,10,5};
    int l = 0;
    int h = arr.length-1;
    quickSort(arr, l, h);
    System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[], int l, int h){
        if(l<h){
            int p = partition(arr,l,h);
            quickSort(arr,l,p);
            quickSort(arr,p+1,h);
        }
    }
    static int partition(int arr[], int l, int h){
        int p = arr[l];
        int i = l-1;
        int j = h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<p);

            do{
                j--;
            }while(arr[j]>p);

            if(i>=j){
            return j;
        }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        
    }
}
