package Hashing;

import java.util.HashSet;

public class InterSectionOfTwoUnsortedArrayss {
    public static void main(String[] args){
    int arr1[] = {10,20,30};
    int arr2[] = {30,20,10};
    intersection(arr1, arr2);
    }

    /* 
    static void intersection(int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++){
            boolean flag = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==true){
                System.out.print(arr1[i]+" ");
            }
        }
    }
    */

    static void intersection(int arr1[], int arr2[]){
        HashSet<Integer>h = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
           if(h.contains(arr2[i])) {
                System.out.print(arr2[i]+" ");
            }
            
        }
    }
    
}
