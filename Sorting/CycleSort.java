package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
    int arr[] = {20,40,50,10,30};
    cycleSort(arr);
    }
    static void cycleSort(int arr[]){
        for(int cs=0;cs<arr.length;cs++){
            int item = arr[cs];
            int pos = cs;
           for(int i =cs+1;i<arr.length;i++){
            if(arr[i]<item){
                pos++;
            }
           }
           int temp = item;
           item = arr[pos];
           arr[pos]=temp;

           while(pos!=cs){
            pos=cs;
            for(int i=cs+1;i<arr.length;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
             int temp1 = item;
           item = arr[pos];
           arr[pos]=temp1;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}
