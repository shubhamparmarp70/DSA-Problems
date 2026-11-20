package BitwiseOperators;
import java.util.*;
public class CheckKthBitIsSetOrNot {
    public static void main(String[] args){
        System.out.println("Enter a number and the position of the bit to check if it is set or not: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter Bit Number:");
        int k = sc.nextInt();
        System.out.println( "In number " + n + "Kth bit " + k + "set or not ? : " + isKthBitSet(n,k));
    }
 /* 
 static boolean isKthBitSet(int n, int k){
        int x = 1;
        for(int i=0;i<k-1;i++){
            x=x*2;   
        }
        if((n&x)!=0){
             return true;
        }
        return false;
    }
        */

/*
static boolean isKthBitSet(int n, int k){

        if(n<k){
            return false;
        }

        for(int i=0;i<k-1;i++){
            n=n/2;   
        }
        if((n&1)!=0){
             return true;
        }
        return false;
    } 
    */

/*  static boolean isKthBitSet(int n, int k){

        if(n<k){
            return false;
        }
        int x = 1;
         x = n<<(k-1);
        if((n&x)!=0){
             return true;
        }
        return false;
    }
    */


    static boolean isKthBitSet(int n, int k){

        if(n<k){
            return false;
        }
        
        n = n>>(k-1);
        if((n&1)!=0){
             return true;
        }
        return false;
    }
}
