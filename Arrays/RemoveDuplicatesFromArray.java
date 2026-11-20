package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args){
    int arr[] = {1,2,4,4,5,6,6,7,8,9,9};
    List<Integer>list = new ArrayList<>();
    removeDuplicates(arr, list);
    System.out.println(list);
    }
    /* static int removeDuplicates(int arr[]){
        int temp[]= new int[arr.length];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=temp[res-1]){
                temp[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            arr[i]=temp[i];
        }
        return res;
    }
    */

    static void removeDuplicates(int arr[], List<Integer> list){
        if (arr.length == 0) {
            return;
        }
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
    }
    
}
