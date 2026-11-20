package Arrays;

public class ReverseAnArray {
    public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6,7,8};
    System.out.println("Array before reverse is : ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    System.out.println("\nArray after reverse is : ");
    reverse(arr);
    }

    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
