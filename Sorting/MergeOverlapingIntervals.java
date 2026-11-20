package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlapingIntervals {
    public static void main(String[] args){
    Interval arr[] = {new Interval(5,10), new Interval(3,15), new Interval(18,30), new Interval(2,7)};
    mergerOverlapingIntervals(arr);
    
    }

    static class Interval{
        int start;
        int end;
        Interval(int s, int e){ this.start = s; this.end = e; }
    }

    static void mergerOverlapingIntervals(Interval arr[]){
       Arrays.sort(arr, new newListCmp());
       int res=0;
       for(int i=1;i<arr.length;i++){
           if(arr[res].end>=arr[i].start){
               arr[res].end = Math.max(arr[i].end, arr[res].end);
               arr[res].start = Math.min(arr[i].start, arr[res].start);
           }else{
               res++;
               arr[res]= arr[i];
           }
       }
       for(int i=0;i<=res;i++){
           System.out.println(arr[i].start + " " + arr[i].end);
       }
    }

    static class newListCmp implements Comparator<Interval> {
         public int compare(Interval i1, Interval i2){
            return i1.start - i2.start;
         }
    }
}
