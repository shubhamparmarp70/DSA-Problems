package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args){
    int arr[] = {15,12,13,12,19,13,18};
    System.out.println(countDistinct(arr));
    }

    /* 
    static int countDistinct(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                res++;
            }
        }
        return res;
    }
    */
    

    static int countDistinct(int arr[]){
        HashSet<Integer>h = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size();
    }
     
    
}
