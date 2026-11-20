package Hashing;

import java.util.*;

public class MoreThanNByKOccurences {

    public static void main(String[] args) {
        int arr[] = {10,10,20,30,20,10,10,20,20};
        int k = 4;

        System.out.println(Arrays.toString(moreThanNByKOccurence(arr, k)));
    }

    /*static int[] moreThanNByKOccurence(int arr[], int k) {

        Arrays.sort(arr);
        int n = arr.length;

        ArrayList<Integer> al = new ArrayList<>();

        int count = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > n / k) {
                    al.add(arr[i - 1]);
                }
                count = 1;
            }
        }

        // Check last element
        if (count > n / k) {
            al.add(arr[n - 1]);
        }

        int ans[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }*/

    static int[] moreThanNByKOccurence(int arr[], int k) {

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> al = new ArrayList<>();

        // Find elements with frequency > n/k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > n / k) {
                al.add(entry.getKey());
            }
        }

        int ans[] = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }
}
