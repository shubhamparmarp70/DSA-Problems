package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {10, 5, 8, 20, 2, 18};

        selectionSort(arr);
    }

    static void selectionSort(int arr[]) {

        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {

            int min_idx = 0;

            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            temp[i] = arr[min_idx];
            arr[min_idx] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

     /* 
   static void selectionSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }*/
}
    
