package SortedArray;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    public static void main(String[] args){
    int arr[] = {80,70,90};
    List<Integer>list = new ArrayList<>();
    peakElement(arr, list);
    System.out.println(list);
    }

    /* 
    static void peakElement(int arr[], List<Integer>list){
        int n= arr.length;
        if(n==1){
            list.add(arr[0]);
        }
        if(arr[0]>=arr[1]){
            list.add(arr[0]);
        }
        if(arr[n-1]>=arr[n-2]){
            list.add(arr[n-1]);
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                list.add(arr[i]);
            }
        }
    }
    */
   static void peakElement(int arr[], List<Integer>list){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==arr.length-1 || arr[mid]>=arr[mid+1])){
                list.add(arr[mid]);
                return;
            }
            else if(arr[mid]<arr[mid-1]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
    
}
