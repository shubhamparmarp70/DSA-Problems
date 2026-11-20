public class factorialCal {
    public static void main(String[] args){
        int n =6;
        System.out.println("Factorial of" + n + "is:"+ factorial(n));
    }
    /* 
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact =fact*i;
        }
        return fact;

    }
        */

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
}
}
