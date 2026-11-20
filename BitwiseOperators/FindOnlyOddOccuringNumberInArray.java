package BitwiseOperators;
public class FindOnlyOddOccuringNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 1, 2};
        System.out.println("The only odd occurring number in given array is : " + OnlyOddOccure(arr));
    }

    /* Naive Solution */
    /*   static int OnlyOddOccure(int arr[]){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            
            }
        }return -1;
        
    } 
    */
     
    /* Efficient Solution */
    static int OnlyOddOccure(int arr[]){
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }


    

}