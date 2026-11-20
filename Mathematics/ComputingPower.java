import java.util.*;
public class ComputingPower {
    public static void main(String[] args){
     try (Scanner sc = new Scanner(System.in)) {
         System.out.print("Enter a number and its power to compute: ");
         System.out.println("Enter number: ");
         int x = sc.nextInt();
         System.out.println("Enter power: ");
         int n = sc.nextInt();
         System.out.println(x + " raised to the power " + n + " is: " + power(x,n));
     }
    }
  /*
   static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int res=1;
        for(int i=0;i<n;i++){
            res=res*x;
        }
        return res;
    }
    */

    /* 
    static int power (int x, int n){
        if(n==0){
            return 1;
        }
        int temp = power(x,n/2);
        temp =temp*temp;
        if(n%2==0){
        return temp;
        }
        return temp*x;
    }
   */

    static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int res=1;
        while(n>0){
            if(n%2==1){
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
}
