package Arrays;

public class EquillibriumPoint {
    public static void main(String[] args){
    int arr[] = {3,4,8,-9,20,6};
    System.out.println(equillibriumPoint(arr));
    }

    /* Brute Force Approach */
    /* 
    static boolean equillibriumPoint(int arr[]){
        for(int i=0;i<arr.length;i++){
            int ls=0, rs=0;
            for(int j=0;j<i;j++){
                ls+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                rs+=arr[j];
            }
            if(ls==rs){
                return true;
            }
        }
        return false;   
    }
    */
   
    static boolean equillibriumPoint(int arr[]){
        int rs=0;
        int ls=0;
        for(int i=0;i<arr.length;i++){
            rs+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            rs-=arr[i];
            if(ls==rs){
                return true;
            }
            ls+=arr[i];
        }
        return false;
    }
    
}
