package Arrays;

public class InsertOperation {
    public static void main(String[] args){
        int arr[] = {1,3,45,65,78,3,23,49};
        int cap=10;
        int x = 7;
        int pos=2;
        System.out.println(insert(arr,cap,x,pos));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    static int insert(int arr[], int cap, int x, int pos){
        if(arr.length==cap){
            return -1;
        }
        int idx = pos-1;
        for(int i=arr.length-1;i>=idx;i--){
            arr[i]=arr[i-1];
        } 
        arr[idx]= x;
        return arr.length+1;
    }
    
}
