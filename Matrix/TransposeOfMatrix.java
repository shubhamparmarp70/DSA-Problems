package Matrix;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args){
     int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     transpose(mat);
    }

    /* 
    static void transpose(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;
        int temp[][] = new int [R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                temp[j][i] = mat[i][j] ;
            }
        }
        for(int i=0;i<R;i++){
        System.out.println(Arrays.toString(temp[i]));
    }
}*/

    static void transpose(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;
        for(int i=0;i<R;i++){
            for(int j=i+1;j<C;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<R;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
