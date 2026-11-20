package Sorting;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args){
    int arr[] = {10,3,5,20};
    int k=2;
    System.out.println(kthSmallest(arr, k));
    }
    
    /* 
    static int kthSmallest(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    */

    static int kthSmallest(int arr[], int k){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int p = partition(arr,l,h);
            if(p==k-1){
                return arr[p];
            }else if(p>k-1){
                h = p-1;
            }else{
                l=p+1;
            }
        }
        return -1;
    }

    static int partition(int arr[], int l, int h){
        int p  = arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<p){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    
}
