package BitwiseOperators;

import java.util.Arrays;

public class TwoOddAppearingNumber {
    public static void main(String[] args){
     int arr[] = {5,6,10,6,10,6,3,3};
     int[] ans = twoOddOccuringNumber(arr);
    System.out.println("The only odd occurring number in given array is : " + Arrays.toString(ans));
    }

    static int[] twoOddOccuringNumber(int arr[]){
        int resArr[]=new int[2];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res= res^arr[i];
        }
        int setBits = res & -res;
        int num1 = 0;
        int num2 = 0;
        for(int num:arr){
            if((num&setBits)!=0){
                num1 ^= num;
            }
            else{
                num2 ^= num;
            }
            resArr[0]=num1;
            resArr[1]=num2;
        }
        return resArr;
    }
}
