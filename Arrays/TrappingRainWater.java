package Arrays;

public class TrappingRainWater {
    public static void main(String[] args){
    int arr[] = {3,0,1,2,5};
    System.out.println(getWater(arr));
    }

    /* 
    static int getWater(int arr[]){
        int res=0;
        for(int i=1;i<=arr.length-1;i++){
           int lMax = arr[i];
           int rMax=arr[i];
           for(int j=0;j<i;j++){
            lMax=Math.max(lMax,arr[j]);
           }
           for(int k=i+1;k<arr.length;k++){
            rMax=Math.max(rMax,arr[k]);
           }
           res= res + Math.min(lMax,rMax)-arr[i];
        }
        return res;
    }
    */

    static int getWater(int arr[]){
        int n = arr.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        rMax[n-1] = arr[n-1];
        for(int i=1;i<arr.length;i++){
            lMax[i]=Math.max(arr[i], lMax[i-1]);
        } 

        for(int i = n-2;i>=0;i--){
            rMax[i]=Math.max(arr[i],rMax[i+1]);
        }
        int res=0;
        for(int i=1;i<=n-1;i++){
            res = res + Math.min(lMax[i],rMax[i])-arr[i];
        }
        return res;
    }
    
}
