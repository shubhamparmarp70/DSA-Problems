import java.util.*;
public class PrimeFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors: ");
        int n = sc.nextInt();
        System.out.println("Prime factors of " + n + " are: ");
        primeFactors(n);
    }
   /*  ***This method finds and prints the prime factors of a given number***
    static void primeFactors(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n; i=i+6){
            if(n%1==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
        */

    /* 
    static void primeFactors(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i + " ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
    }
        */

    static void primeFactors(int n){
        if(n<=1){
            return;
        }
        while(n%2==0){
            System.out.print(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3 + " ");
            n=n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n%i==0){
                System.out.print(i + " ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print(i+2 + " ");
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.print(n);
        }
    }
}
