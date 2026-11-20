package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class GeneratingNumberWithGivenDigits {
    public static void main(String[] args){
     int n = 10;
     System.out.println(Arrays.toString(printFirstN(n)));
    }

    static String[] printFirstN(int n){
        String[] arr = new String[n];
        int i=0;
        Queue<String> q = new LinkedList<String>();
        q.add("5");
        q.add("6");

        for(int count=0;count<n;count++){
            String curr = q.poll();
            arr[i] = curr;
            i++;
            q.add(curr+"5");
            q.add(curr+"6");
        }

        return arr;
    }
}
