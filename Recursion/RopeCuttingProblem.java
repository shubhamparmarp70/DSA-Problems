package Recursion;
import java.util.*;
public class RopeCuttingProblem {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n  = sc.nextInt();
    System.out.println("Enter a : ");
    int a = sc.nextInt();
    System.out.println("Enter b : ");
    int b = sc.nextInt();
    System.out.println("Enter c : ");
    int c = sc.nextInt();

    System.out.println("The number of maximum pieces of a rope are : " +maxPieces(n, a, b, c));
    }
    static int maxPieces(int n, int a, int b, int c){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }

       int res = Math.max(
            maxPieces(n-a, a, b, c),
            Math.max(
                maxPieces(n-b, a, b, c),
                maxPieces(n-c, a, b, c)
            )
          );
        if(res==-1){
            return res;
        }
        return res+1;
    }
}
