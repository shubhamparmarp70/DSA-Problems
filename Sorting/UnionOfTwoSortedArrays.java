package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args){
    int nums1[] = {3,5,8};
    int nums2[] = {2,8,9,10,15};
    System.out.println(Arrays.toString(union(nums1,nums2)));
    }

    /* 
     static int[] union(int nums1[], int nums2[]){
        int arr[] = new int[nums1.length + nums2.length];
        List<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }

        int ans[] = new int[list.size()];
        for(int j=0;j<list.size();j++){
          ans[j] = list.get(j);
        }
        return ans;
        
    }
    */

    static int[] union(int nums1[], int nums2[]){
        List<Integer>list = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            if(j>0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                list.add(nums2[j]);
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            if(i==0 || nums1[i]!=nums1[i-1]){
                list.add(nums1[i]);
            }
            i++;
        }
        while(j<nums2.length){
            if(j==0 || nums2[j]!=nums2[j-1]){
                list.add(nums2[j]);
            }
            j++;
        }

        int arr[] = new int[list.size()];
        for(int k=0;k<list.size();k++){
            arr[k] = list.get(k);
        }
        return arr;
    }
   
}
