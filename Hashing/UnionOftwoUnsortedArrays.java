package Hashing;

import java.util.HashSet;

public class UnionOftwoUnsortedArrays {
    public static void main(String[] args){
    int arr1[] = {15,20,5,15};
    int arr2[] = {15,15,15,20,10};
    union(arr1, arr2);
    }

    static void union(int arr1[], int arr2[]){
        HashSet<Integer>h = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            h.add(arr2[i]);
        }

        System.out.println(h);
    }
}
