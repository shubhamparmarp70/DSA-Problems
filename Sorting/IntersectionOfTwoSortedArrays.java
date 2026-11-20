package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args){
  int nums1[]= {3,5,10,10,10,15,20};
  int nums2[]={5,10,10,15,30};
  System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    /*
    static int[] intersection(int nums1[], int nums2[]){
        List<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            if(i>0 && nums1[i]==nums1[i-1]){
                continue;
            }
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }   
        }
        int arr[] = new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);
        }
        return arr;
    }
     */


    public static int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer>list=new ArrayList<Integer>();
       int i=0,j=0;
       while(i<nums1.length && j<nums2.length){
        if(i>0 && nums1[i]==nums1[i-1]){
            i++;
            continue;
        }
        if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
              j++;
        }
        else{
            list.add(nums1[i]);
            i++;
            j++;
        }
       }
       int arr[] = new int[list.size()];
       for(int k=0;k<list.size();k++){
        arr[k]=list.get(k);
       }
       return arr;
    }  
}

