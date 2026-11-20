package String;

import java.util.ArrayList;
import java.util.Arrays;

public class RabinKarpPatternSearching {
    public static void main(String[] args) {

        String txt = "ABCABCDABCD";
        String pat = "ABCD";

        System.out.println(Arrays.toString(search(txt, pat)));
    }

      static final int d = 256;

    static int[] search(String txt, String pat) {

        int q = 101;          // Prime number
        int n = txt.length();
        int m = pat.length();

        int p = 0;            // Pattern hash
        int t = 0;            // Text window hash
        int h = 1;

        ArrayList<Integer> list = new ArrayList<>();

        // Compute h = pow(d, m-1) % q
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Compute initial hash values
        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {

            // If hash matches
            if (p == t) {

                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }

                if (j == m)
                    list.add(i);
            }

            // Calculate next window hash
            if (i < n - m) {

                t = (d * (t - txt.charAt(i) * h)
                        + txt.charAt(i + m)) % q;

                if (t < 0)
                    t += q;
            }
        }

        int ans[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}
