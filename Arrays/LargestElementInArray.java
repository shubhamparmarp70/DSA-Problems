package Arrays;

public class LargestElementInArray {
    public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6,7,8};
    System.out.println(largestElement(arr));
    }

    /* 
    static int largestElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return arr[i];
            }
        }return -1;
    }
    */

    static int largestElement(int arr[]){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }return res;
    }
    
}
