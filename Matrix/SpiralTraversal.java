package Matrix;
import java.util.Arrays;

/*
public class SpiralTraversal {
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };

        int[] result = spiralTraversal(mat);
        System.out.println(Arrays.toString(result));
    }

    static int[] spiralTraversal(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;

        int[] ans = new int[R * C];
        int index = 0;

        int left = 0, right = C - 1, top = 0, bottom = R - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++)
                ans[index++] = mat[top][i];
            top++;

            for (int i = top; i <= bottom; i++)
                ans[index++] = mat[i][right];
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans[index++] = mat[bottom][i];
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans[index++] = mat[i][left];
                left++;
            }
        }

        return ans;
    }
}
 */

public class SpiralTraversal {
    public static void main(String[] args) {
        int mat[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int[][] result = spiralTraversal(mat);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] spiralTraversal(int[][] mat) {

        int R = mat.length;
        int C = mat[0].length;

        int[][] result = new int[R][C];

        int left = 0, right = C - 1;
        int top = 0, bottom = R - 1;

        int r = 0, c = 0;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                result[r][c] = mat[top][i];
                c++;
                if (c == C) {
                    c = 0;
                    r++;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[r][c] = mat[i][right];
                c++;
                if (c == C) {
                    c = 0;
                    r++;
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[r][c] = mat[bottom][i];
                    c++;
                    if (c == C) {
                        c = 0;
                        r++;
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[r][c] = mat[i][left];
                    c++;
                    if (c == C) {
                        c = 0;
                        r++;
                    }
                }
                left++;
            }
        }

        return result;
    }
}