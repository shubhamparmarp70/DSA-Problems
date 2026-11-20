import java.util.*;
public class AllDivisorsOfANumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find all its divisors: ");
    int n = sc.nextInt();
    System.out.print("All divisors of " + n + " are: ");
    printDivisior(n);

} 
/*  Naive Solution */
/*  This solution has a time complexity of O(n) 
static void printDivisior(int n){
    if(n<1){
        return;
    }
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.print(i + " ");
        }
    }
}
    */

/*  Efficient Solution */
/*  This solution has a time complexity of O(√n) 
static void printDivisior(int n){
    if(n<1){
        return;
    }
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            System.out.print(i + " ");
            if(i!=n/i){
                System.out.print(n/i + " ");
            }
        }
    }
}
    */

static void printDivisior(int n){
    if(n<1){
        return;
    }
    for(int i=1;i*i<n;i++){
        if(n%i==0){
            System.out.print(i + " ");
        }
    }
  
    for(int i=(int)Math.sqrt(n);i>=1;i--){
       if(n%i==0){
        System.out.print(n/i + " ");
       }
    }
}
}
