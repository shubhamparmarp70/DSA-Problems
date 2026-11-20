package Stack;

import java.util.Stack;

public class LongestAreaHistogram {
    public static void main(String[] args){
    int[] arr = {6,2,5,4,1,5,6};
    System.out.println(longestArea(arr));
    }

    /*static int longestArea(int arr[]){
        int n = arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>=arr[i]){
                    curr += arr[i];
                }else{
                    break;
                }
            }
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    curr+=arr[i];
                }else{
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }*/

    static int longestArea(int[] arr){
        int n =arr.length;
        int res=0;
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int tp = s.pop();
                int width = s.isEmpty() ? i : i - s.peek() - 1;
                int curr = arr[tp] * width;
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int tp = s.pop();
            int width = s.isEmpty() ? n : n - s.peek() - 1;
            int curr = arr[tp] * width;
            res = Math.max(res, curr);
        }
        return res;
    }
}
