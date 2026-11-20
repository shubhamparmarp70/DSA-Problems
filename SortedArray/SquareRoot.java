package SortedArray;

public class SquareRoot {
    public static void main(String[] args){
        int n = 1680;
        System.out.println(squareRoot(n));
    }

    /* Naive Solution*/
    /*static int squareRoot(int n){
        int i=1;
        while(i*i<=n){
            i++;
        }
       return i-1;
}*/

    static int squareRoot(int n){
        if(n==0){
            return 0;
        }
        int low=1;
        int high=n;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
            int msq=mid*mid;
        if(msq==n){
            return mid;
        }else if(msq>n){
            high=mid-1;
        }else{
            low=mid+1;
            ans=mid;
        }
    }
        return ans;
      }
}
