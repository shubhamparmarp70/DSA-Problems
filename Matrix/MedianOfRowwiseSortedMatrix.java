package Matrix;

import java.util.Arrays;

public class MedianOfRowwiseSortedMatrix {

    public static void main(String[] args) {

        int mat[][] = {
                {5,10,20,30,40},
                {1,2,3,4,6},
                {11,13,15,17,19}
        };

        System.out.println(median(mat));
    }

    static int median(int[][] mat){

        int R = mat.length;
        int C = mat[0].length;

        int min = mat[0][0];
        int max = mat[0][C-1];

        for(int i=1;i<R;i++){

            if(mat[i][0] < min)
                min = mat[i][0];

            if(mat[i][C-1] > max)
                max = mat[i][C-1];
        }

        int medPos = (R*C+1)/2;

        while(min < max){

            int mid = (min+max)/2;

            int midPos = 0;

            for(int i=0;i<R;i++){

                int pos = upperBound(mat[i], mid);
                midPos += pos;
            }

            if(midPos < medPos)
                min = mid+1;
            else
                max = mid;
        }

        return min;
    }

    static int upperBound(int[] arr, int x){

        int low = 0;
        int high = arr.length;

        while(low < high){

            int mid = (low+high)/2;

            if(arr[mid] <= x)
                low = mid+1;
            else
                high = mid;
        }

        return low;
    }
}
