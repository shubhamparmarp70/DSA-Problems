package Sorting;

public class CountInversions {
    public static void main(String[] args){
    int arr[] = {2,5,8,11,3,6,9,13};
    int l=0;
    int r=arr.length-1;
    System.out.println(countInversions(arr,l,r));
    }

    /* 
    static int countInversions(int arr[]){
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }
    */

    static int countInversions(int arr[], int l, int r){
        int res=0;
        if(r>l){
            int m = l+(r-l)/2;
            res += countInversions(arr,l,m);
            res += countInversions(arr,m+1,r);
            res += countAndMerge(arr,l,m,r);

        }
        return res;
    }

    static int countAndMerge(int arr[], int l, int m ,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
       
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[m+i+1];
        }
        int i=0,j=0,k=l,res=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k]=right[j];
                res = res + (n1-i);
                k++;
                j++;
            }
        }while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    
}
