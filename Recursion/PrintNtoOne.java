package Recursion;

public class PrintNtoOne {
        public static void main(String[] args){
     printNto1(15);
    }

    static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}
    

