package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
    int arr1[] = {10,15,20};
    int arr2[] = {5,6,6,15};
    mergeSort(arr1, arr2);
    }

    /* 
    static void mergeSort(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[] = new int[n1+n2];

        for(int i=0;i<n1;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[n1+i]=arr2[i];
        }

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));
    }
    */

    static void mergeSort(int arr1[], int arr2[]){
        int i=0,j=0,k=0;
        int arr3[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr3));
    }
    
}
