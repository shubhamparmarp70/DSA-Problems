package Arrays;

public class RotateAnArrayByD {
    public static void main(String[] args){
        int arr[] =  {1,2,3,4,5,6,7};
        int n = arr.length;
        int x=5; 
        int d = x%n;
    rotateArrayByD(arr,d);
    }

    /* 
    public static void rotateArrayByOne(int arr[]){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

       
        }

    static void rotateArrayByD(int arr[], int d){
        for(int i=0;i<d;i++){
           rotateArrayByOne(arr); 
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}      
    */
    /* 
    static void rotateArrayByD(int arr[], int d){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i]= arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[arr.length-d+i]= temp[i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    */

    static void rotateArrayByD(int arr[], int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
