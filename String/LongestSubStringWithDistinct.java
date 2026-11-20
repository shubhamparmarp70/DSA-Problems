package String;

public class LongestSubStringWithDistinct {
    public static void main(String[] args) {

        String str = "ABDEFGABEF";

        System.out.println(longestDistinct(str));
    }

    // Naive Solution (O(n³))
    /*static int longestDistinct(String str) {

        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                if (allDistinct(str, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }

        return res;
    }

    static boolean allDistinct(String str, int start, int end) {

        boolean[] visited = new boolean[256];

        for (int i = start; i <= end; i++) {

            if (visited[str.charAt(i)])
                return false;

            visited[str.charAt(i)] = true;
        }

        return true;
    }*/
    
    // Better Naive Solution (O(n²))
    /*static int longestDistinct(String str) {

        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {

                if (visited[str.charAt(j)])
                    break;

                visited[str.charAt(j)] = true;

                res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }*/

    // Efficient Solution (Sliding Window) – O(n)
    static int longestDistinct(String str) {

        int n = str.length();

        int[] lastIndex = new int[256];

        for (int i = 0; i < 256; i++)
            lastIndex[i] = -1;

        int res = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {

            start = Math.max(start, lastIndex[str.charAt(end)] + 1);

            res = Math.max(res, end - start + 1);

            lastIndex[str.charAt(end)] = end;
        }

        return res;
    }
    
}
