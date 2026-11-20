package Sorting;

public class BubbleSort {
    public static void main(String[] args){
    int arr[] = {10,8,20,5};
    bubbleSort(arr);
    }

 
    /* 
    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    */
    
    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag =  false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  flag=true;
                }
            }if(flag==false){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
