import java.util.*;
public class PrintAllPrimeFrom1ToN {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to print all prime numbers from 1 to N: ");
      int n = sc.nextInt();
      System.out.println("All prime numbers from 1 to " + n + " are: ");
      printPrimes(n);
    }

    static void printPrimes(int n){
        if(n<=1){
            return;
        }
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 ||n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
