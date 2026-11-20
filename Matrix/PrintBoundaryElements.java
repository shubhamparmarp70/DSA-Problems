package Matrix;

public class PrintBoundaryElements {
    public static void main(String[] args){
    int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    bTraversal(mat);
    }
    static void bTraversal(int mat[][]){
        int R = mat.length;
        int C = mat[0].length;

        if(R==1){
            for(int i=0;i<C;i++){
                System.out.print(mat[0][i]);
            }
        }
        if(C==1){
            for(int i=0;i<R;i++){
                System.out.println(mat[i][0]);
            }
        }
        else{
            for(int i=0;i<C;i++){
              System.out.println(mat[0][i]);
            }
            for(int i=1;i<R;i++){
                System.out.println(mat[i][C-1]);
            }
            for(int i=C-2;i>=0;i--){
                System.out.println(mat[R - 1][i]);
            }
            for(int i=R-2;i>=1;i--){
                System.out.println(mat[i][0]);
            }
        }
    }
}
