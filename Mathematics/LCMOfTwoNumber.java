import java.util.*;
public class LCMOfTwoNumber {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers to find LCM: ");
         System.out.println("Enter first number: ");
         int a = sc.nextInt();
         System.out.println("Enter second number: ");
         int b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is : " + lcm(a,b));  
      }
      /*   ***Function to find LCM of two numbers*** 

   static  int lcm(int a, int b){
    int res = Math.max(a,b);
    while(true){
        if(res%a==0 && res%b ==0){
             break;
        }
        res++;
    }
      return res;
    }
    */
   static int gcd(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return gcd(b,a%b);
    }

   }

   static int lcm(int a, int b){
    return (a*b)/gcd(a,b);   }
}
