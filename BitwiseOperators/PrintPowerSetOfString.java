package BitwiseOperators;
import java.util.*;
public class PrintPowerSetOfString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("Power set of " + s + " is:");

        String[] ans = powerSet(s);

        for (String str : ans) {
            System.out.println(str);
        }
    }

    public static String[] powerSet(String s) {
        int n = s.length();
        int pSize = 1 << n;

        String[] arr = new String[pSize];

        for (int i = 0; i < pSize; i++) {
            String subset = "";

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset += s.charAt(j);
                }
            }

            arr[i] = subset;
        }

        return arr;
    }
}
