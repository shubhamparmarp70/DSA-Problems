package Arrays;
import java.util.*;
public class SearchElement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        System.out.println("Enter element at index : "+ i);
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter element to be searched : ");
    int x = sc.nextInt();

    System.out.println(search(arr,x));
    }
    static int search(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
