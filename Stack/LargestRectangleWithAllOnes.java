package Stack;

import java.util.Stack;

public class LargestRectangleWithAllOnes {
    public static void main(String[] args){
    int[][] arr = {{0,1,1,0},
                   {1,1,1,1},
                   {1,1,1,1},
                   {1,1,0,0}};
                   System.out.println(maxrectangle(arr));

    } 
    static int maxrectangle(int[][] arr){
        int res = largestArea(arr[0]);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    arr[i][j]+=arr[i-1][j];
                }
            }
            res = Math.max(res,largestArea(arr[i]));
        }
        return res;
    }

    static int largestArea(int[] arr){
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
