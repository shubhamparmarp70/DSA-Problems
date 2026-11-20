package Matrix;

import java.util.Arrays;

public class RotateBy90 {
    public static void main(String[] args){
    int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    rotateBy90(mat);
    }

    /*static void rotateBy90(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;
        int temp[][] = new int[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                 temp[R-j-1][i] = mat[i][j];
            }
        }
        for(int i=0;i<R;i++){
            System.out.println(Arrays.toString(temp[i]));
        }
    }*/

    
    static void rotateBy90(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;

        for(int i=0;i<R;i++){
            for(int j=i+1;j<C;j++){
                int temp = mat[j][i];
                mat[j][i]=mat[i][j];
                mat[i][j] = temp;
            }
        }
        for(int i=0;i<R;i++){
            int low=0, high=R-1;
            while(low<high){
                int temp = mat[low][i];
                mat[low][i]=mat[high][i];
                mat[high][i]=temp;
                low++;
                high--;
            }
        }
        for(int i=0;i<R;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
