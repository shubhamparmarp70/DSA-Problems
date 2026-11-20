package Sorting;

import java.util.Arrays;

public class SegregatePosNeg {
    public static void main(String[] args){
    int arr[] = {15,-3,-2,18};
    segregatePosNeg(arr);
    System.out.println(Arrays.toString(arr));
    }

    /* 
    static int[] segregatePosNeg(int arr[]){
        int temp[] = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
            temp[index]=arr[i];
            index++;
           }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                temp[index]=arr[i];
                index++;
            }
        }
        return temp;
    }
    */
   static void segregatePosNeg(int arr[]){
    int i=-1;
    int j=arr.length;
    while(true){
        do{
            i++;
        }while(arr[i]<0);

        do{
            j--;
        }while(arr[j]>=0);

        if(i>=j){
            return ;
        }
        int x=arr[i];
        arr[i] = arr[j];
        arr[j]=x;
    }
   }
    
}
