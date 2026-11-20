package Matrix;

public class SearchInSorted2DMatrix {
    public static void main(String[] args){
    int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int x = 29;
    search(mat, x);
    }

    /*
    static boolean search(int mat[][], int x){
        int R = mat.length;
        int C = mat[0].length;

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(mat[i][j]==x){
                 System.out.println("Found at (" + i + ", " + j + ")");
                   return;   
                }
            }      
        }
          System.out.println("Not Found");     
    }
     */

    static void search(int[][] mat, int x) {

    int R = mat.length;
    int C = mat[0].length;

    int i = 0;
    int j = C - 1;

    while (i < R && j >= 0) {

        if (mat[i][j] == x) {
            System.out.println("Found at (" + i + ", " + j + ")");
            return;
        }
        else if (mat[i][j] > x) {
            j--;
        }
        else {
            i++;
        }
    }

    System.out.println("Not Found");
}
}
