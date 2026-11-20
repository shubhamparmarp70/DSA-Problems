package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args){
    int arr[] = {7,10,4,3,6,5,2};
    List<Integer>list = new ArrayList<>();
    printLeader(arr,list);
    System.out.print(list);
    }

    /* 
    static void printLeader(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
    */

    static void printLeader(int arr[], List<Integer>list){
        int n = arr.length;
        int curr_ldr = arr[n-1];
        list.add(curr_ldr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_ldr){
                curr_ldr=arr[i];
                list.add(curr_ldr);
            }
        }
    }
    
}
