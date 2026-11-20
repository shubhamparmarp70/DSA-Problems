package Hashing;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args){
    int arr[] = {1,4,13,-3,-10,5};
    System.out.println(is0Sum(arr));
    }

    /*static boolean is0Sum(int arr[]){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               if(sum==0){
                return true;
               }
            }
        }
        return false;
    }*/

    static boolean is0Sum(int arr[]){
        HashSet<Integer>h = new HashSet<Integer>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
             pre_sum+=arr[i];
             if(h.contains(pre_sum)){
                return true;
             }
             if(pre_sum==0){
                return true;
             }
             h.add(pre_sum);
        }
        return false;
    }
}

