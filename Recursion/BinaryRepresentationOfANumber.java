package Recursion;

public class BinaryRepresentationOfANumber {
    public static void main(String[] args){
    binnaryRepresentaion(13);
    }
    static void binnaryRepresentaion(int n){
        if(n==0){
            return;
        }
        binnaryRepresentaion(n/2);
        System.out.print(n%2);
    }
}
