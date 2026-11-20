package Sorting;

import java.util.Arrays;

public class PartitionOfAnArray {
    public static void main(String[] args){
    int arr[] = {3,8,6,12,10,7};
    int p = 5;
    partition(arr,p);
    }
    static void partition(int arr[], int p){
        int temp[] = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=arr[p] && i!=p){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
