package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args){
    int arr[] = {30,40,10,80,5,12,70};
    int k=4;
    bucketSort(arr,k);
    System.out.println(Arrays.toString(arr));
    }
    static void bucketSort(int arr[], int k){
      int n = arr.length;
      int maxVal = arr[0];
      for(int i=1;i<n;i++){
        maxVal = Math.max(arr[i], maxVal);
      }
      maxVal++;

      ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<k;i++){
       bkt.add(new ArrayList<Integer>());
      }

      for(int i=0;i<n;i++){
        int bi = (k*arr[i])/maxVal;
        bkt.get(bi).add(arr[i]);
      }

      for(int i=0;i<k;i++){
        Collections.sort(bkt.get(i));
      }

      int index=0;
      for(int i=0;i<k;i++){
        for(int j=0;j<bkt.get(i).size();j++){
              arr[index++]=bkt.get(i).get(j);
        }
      }
    }
}
