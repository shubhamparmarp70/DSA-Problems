package Recursion;

public class JosephusProblem {
    public static void main(String[] args){
     int n = 7;
     int k =3;
     System.out.println(JOS(n,k));
    }
    static int JOS(int n, int k){
        if(n==1){
            return 0;
        }
        return (JOS(n-1,k)+k)%n;
    }
}
