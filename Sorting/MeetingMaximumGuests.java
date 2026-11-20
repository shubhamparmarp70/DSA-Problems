package Sorting;

import java.util.Arrays;

public class MeetingMaximumGuests {
    public static void main(String[] args){
     int arr[] = {900,940,950,1100,1500,1800};
     int dep[] = {910,1200,1120,1130,1900,2000};
     System.out.println(meetMaximumGuest(arr, dep));
    }

    static int meetMaximumGuest(int arr[], int dep[]){
        int res=1, curr=1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1, j=0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;
            }
            res = Math.max(res,curr);
        }

        return res;
    }
}
