package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int arr[] = {0,1,2,0,4,3,0,0,5,6,7,0};
        
        moveZerosAtTheEnd(arr);
        System.out.println( Arrays.toString(arr));

    }

    /* 
    static void moveZerosAtTheEnd(int arr[],List<Integer>list){
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               for(int j=i+1;j<arr.length;j++){
                if(arr[j]!=0){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                    
                }
               }list.add(arr[i]);
            }
            else{
                list.add(arr[i]);
            }
            
        }
    }
    */
    
    static void moveZerosAtTheEnd(int arr[]){
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            int temp = arr[count];
            arr[count] = arr[i];
            arr[i] = temp;
            count++;
                  
        }
     }
    }
}
