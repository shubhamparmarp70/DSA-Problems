package SortedArray;

public class RepeatingElement {
    public static void main(String[] args){
    int arr[] = {4,2,1,3,2,2};
    System.out.println(repeatElement(arr));  
    }

    /* 
    static int repeatElement(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    */
    /* Array Having Element from 1 */
     static int repeatElement(int arr[]){
        int slow=arr[0], fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
   /* Array Having Element from 0 */
    /*static int repeatElement(int arr[]){
        int slow=arr[0]+1, fast=arr[0]+1;
        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        }while(slow!=fast);

        slow=arr[0]+1;
        while(slow!=fast){
            slow=arr[slow]+1;
            fast=arr[fast]+1;
        }
        return slow-1;
    }
    */
  
}
