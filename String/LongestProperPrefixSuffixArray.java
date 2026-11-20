package String;

import java.util.Arrays;

public class LongestProperPrefixSuffixArray {

     /*
    public static void main(String[] args) {

        String str = "ababab";

        int[] lps = new int[str.length()];

        fillLps(str, lps);

        System.out.println(Arrays.toString(lps));
    }

    
    static int longestPrefixSuffix(String str) {
        int n = str.length();

        for (int len = n - 1; len > 0; len--) {

            boolean flag = true;

            for (int i = 0; i < len; i++) {

                if (str.charAt(i) != str.charAt(n - len + i)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                return len;
        }

        return 0;
    }

    static void fillLps(String str, int[] lps) {

        for (int i = 0; i < str.length(); i++) {
            lps[i] = longestPrefixSuffix(str.substring(0, i + 1));
        }
    }
    */

      public static void main(String[] args) {

        String str = "ababab";

        int[] lps = fillLPS(str);

        System.out.println(Arrays.toString(lps));
    }

    static int[] fillLPS(String str) {

        int n = str.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {

            if (str.charAt(i) == str.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len == 0) {

                    lps[i] = 0;
                    i++;

                } else {

                    len = lps[len - 1];

                }
            }
        }

        return lps;
    }
    
}
