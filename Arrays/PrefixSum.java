package Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int arr[] = {2,8,3,9,6,5,4};
        int l=1;
        int r=3;
        System.out.println(prefixSum(arr,l,r));
    }

    /* Brute Force Approach */
    /* static int prefixSum(int arr[], int l, int r){
        int res=0;
        for(int i=l;i<=r;i++){
            res+=arr[i];
        }
        return res;
    }
    */

    static int prefixSum(int arr[], int l, int r){
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        if(l==0){
            return prefix[r];
        }
        else{
            return prefix[r]-prefix[l-1];
        }
    }
    
}
