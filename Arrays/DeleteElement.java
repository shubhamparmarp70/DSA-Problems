package Arrays;

public class DeleteElement {
    public static void main(String[] args){
     int arr[] = {1,2,3,4,5,6,7,8,9,0};
     int x=6;
     System.out.println(deleteElement(arr, x));
    }
    static int deleteElement(int arr[], int x){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x){
                break;
            }
        }
            if(i==arr.length){
                return -1;
               
            }
        
            for(int j=i;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
        return arr.length-1;

    }
}
