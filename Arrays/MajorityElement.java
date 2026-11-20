package Arrays;

public class MajorityElement {
    public static void main(String[] args){
        int arr[] = {6,8,4,8,};
        System.out.println(majorityElement(arr));
}

/* Function to find the majority element in an array */
/* static int majorityElement(int arr[]){
    for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==arr[i]){
                count++;
            }
        }if(count>arr.length/2){
            return arr[i];
        }
    }return -1;
}
*/

/* Moore's Voting Algorithm */
static int majorityElement(int arr[]){
    int res=0;
    int count=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[res]){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            res=i;
            count=1;
        }
    }
     count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==arr[res]){
            count++;
        }
        if(count>arr.length/2){
            return arr[res];
        }
    }
    return -1;
}

}
