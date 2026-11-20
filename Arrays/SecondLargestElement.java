package Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
     int arr[] = {1,20,3,23,45,660,7,86};
     System.out.println(secondLargest(arr));
    }

    /* 
     static int secondLargest(int arr[]){
     int largest = getLargest(arr);
     int res=-1;
     for(int i=0;i<arr.length;i++){
      if(arr[i]!=arr[largest]){
        if(res==-1){
            res=i;
        }
        else if(arr[i]>arr[res]){
            res=i;
        }
      }      
     }return res;
    }
    static int getLargest(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }return res;
    }
    */

    /* Efficient Solution */
    static int secondLargest(int arr[]){
        int res=-1;
        int largest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1||arr[i]>arr[res]){
                    res=i;
                }
            }
            
        }return res;
    }
   
}
