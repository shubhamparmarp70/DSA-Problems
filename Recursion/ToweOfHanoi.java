package Recursion;

public class ToweOfHanoi {
    public static void main(String[] args){
     char a = 'A';
     char b = 'B';
     char c = 'C';
     printTOH(3,a,b,c);
    }
    static void printTOH(int n, char a, char b, char c){
        if(n==1){
            System.out.println("Move 1 from : "+ a + " To " + c);
            return;
        }
        printTOH(n-1,a,c,b);
            System.out.println("Move " + n + " from : " + a + " TO " + c);
        printTOH(n-1,b,a,c);
}
}
