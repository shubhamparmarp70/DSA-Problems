package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElementsInEachWindow {
    public static void main(String[] args) {
        int arr[] = {10, 10, 5, 3, 20, 5};
        int k = 4;

        System.out.println(Arrays.toString(countDistinctInEachWindow(arr, k)));
    }

    /*static int[] countDistinctInEachWindow(int arr[], int k) {
        int n = arr.length;
        int ans[] = new int[n - k + 1];
        int index = 0;

        for (int i = 0; i <= n - k; i++) {
            int count = 0;

            for (int j = 0; j < k; j++) {
                boolean flag = false;

                for (int p = 0; p < j; p++) {
                    if (arr[i + j] == arr[i + p]) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    count++;
                }
            }

            ans[index++] = count;
        }

        return ans;
    }*/

    static int[] countDistinctInEachWindow(int arr[], int k) {

        int n = arr.length;
        int ans[] = new int[n - k + 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        // Insert first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ans[0] = map.size();

        // Process remaining windows
        for (int i = k; i < n; i++) {

            // Remove first element of previous window
            int outgoing = arr[i - k];
            map.put(outgoing, map.get(outgoing) - 1);

            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }

            // Add new element
            int incoming = arr[i];
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            ans[i - k + 1] = map.size();
        }

        return ans;
    }
}