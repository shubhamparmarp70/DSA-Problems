package SortedArray;

public class AllocateMinimumNumberOfPages {
    public static void main(String[] args){
    int arr[] = {10,5,30,1,2,3,10,10};
    int n = arr.length;
    int k=3;
    System.out.println(minimumPages(arr, n, k));
    }

    /* 
    static int minimumPages(int arr[], int n,int k){
        if(n==1){
            return arr[0];
        }
        if(k==1){
            return sum(arr,0,n-1);
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res=Math.min(res,Math.max(minimumPages(arr, i,k-1),sum(arr,i,n-1)));
        }
        return res;
    }

    static int sum(int arr[], int start, int end){
        int res=0;
        for(int i=start;i<=end;i++){
            res+=arr[i];
        }
        return res;
    }
    */

    static int minimumPages(int arr[], int n, int k){
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int low=max;
        int high=sum;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(arr,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    static boolean isFeasible(int arr[], int k, int ans){
        int req=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+sum > ans){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
}
