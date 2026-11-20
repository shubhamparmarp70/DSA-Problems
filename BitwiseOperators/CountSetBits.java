package BitwiseOperators;

import java.util.Scanner;

public class CountSetBits {
    static int tbl[] = new int[256];

    public static void main(String[] args){
     initialize();
     System.out.println("Enter number to find set Bits : ");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     System.out.println("The Number of set Bits in Number" + num + " is : " + countSetBit(tbl, num) );
    }

    /*
    static int countSetBit(int n){
        int count=0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
    */

    /* Brian Kerningum's Algorithm */
    /* 
    static int countSetBit(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count=count+1;
        }
        return count;
    }
    */
    
    /* Table Solution */
    static void initialize(){
        tbl[0] = 0;
        for(int i=1;i<256;i++){
            tbl[i] = tbl[i&(i-1)]+1;
        }
    }

    static int countSetBit(int tbl[],int n){
        return tbl[n&255] + tbl[n>>8 & 255] + tbl[n>>16 & 255] + tbl[n>>24];
    }

    
}
