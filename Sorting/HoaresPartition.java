package Sorting;

public class HoaresPartition {
    public static void main(String[] args){
    int arr[] = {10,80,30,90,40,50,70};
    int l=0;
    int h=arr.length-1;
    System.out.println(hoaresPartition(arr,l,h));
    }

    static int hoaresPartition(int arr[], int l, int h){
        int p = arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
            i++;
        }while(arr[i]<p);
        
        do{
            j--;
        }while(arr[j]>p);

        if(i>=j){
            return j;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 
    }
}
