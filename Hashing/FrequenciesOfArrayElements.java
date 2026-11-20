package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10,12,10,15,10,20,12,12};
        countFreq(arr, arr.length);
    }
    
    /* 
    static void printFreq(int arr[], int n) {

        for (int i = 0; i < n; i++) {

            boolean flag = false;

            // Check if element has already appeared
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            int freq = 1;

            // Count frequency
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            System.out.println(arr[i] + " " + freq);
        }
    }
    */

    static void countFreq(int arr[], int n){
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    
}
