package Arrays;

public class MaximumConsicutiveOnes {
    public static void main(String[] args){
    int arr[] = {1,1,0,1,1,0,0,1,1,0,0,0};
    System.out.println(maximumConsicutiveOne( arr));
    }

    /* 
     static int maximumCosicutiveOne(int arr[]){
        int  res =0;
        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==1){
                    curr++;
                } else{
                    break;
                }
                
            }res=Math.max(res,curr);
        }
        return res;
    }
    */

    static int maximumConsicutiveOne(int arr[]){
        int res=0;
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                curr++;
                res=Math.max(res,curr);
            }else{
                curr=0;
            }
        }
        return res;
    }
   
}
