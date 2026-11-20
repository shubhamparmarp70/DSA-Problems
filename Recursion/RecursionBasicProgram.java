package Recursion;

public class RecursionBasicProgram {
    public static void main(String[] args){
    System.out.println(fun(16));
    }
    /* static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    */

    /*
    static void fun(int n){
    if(n==0){
        return;
    }
    fun(n-1);
    System.out.println(n);
    fun(n-1);
   }
 */
   
   static int fun(int n){
    if(n==1){
        return 0;
    }
    return 1+fun(n/2);
   }
   
}
