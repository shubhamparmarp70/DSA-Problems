package Sorting;

public class LomutoPartition {
    public static void main(String[] args){
    int arr[] = {10,80,30,90,40,50,70};
    int l=0;
    int h = arr.length-1;
    System.out.println(lomutoPartition(arr, l, h));
    }
    static int lomutoPartition(int arr[], int l, int h){
        int p = arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<p){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return i+1;
    }
}
