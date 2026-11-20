package Arrays;

public class MaximumAppearingElementInRange {
    public static void main(String[] args){
        int L[] = {1,2,5,15};
        int R[] = {5,8,7,18};
        int n = L.length;
        System.out.println(maxAppearingElement(L,R,n));
    }

    /* Function to find the maximum appearing element in the given ranges */
    /*static int maxAppearingElement(int L[], int R[], int n){
        int freq[] = new int[100];
        for(int i=0;i<n;i++){
            for(int j=L[i];j<=R[i];j++){
                freq[j]+=1;
            }
        } 
        int res=0;
        for(int i=1;i<100;i++){
            if(freq[i]>freq[res]){
                res=i;
            }
        }
        return res;
    }*/

    /* Optimized Approach */
static int maxAppearingElement(int L[], int R[], int n){
    int freq[] = new int[100];
    for(int i=0;i<n;i++){
        freq[L[i]]++;
        freq[R[i]+1]--;
    }
    int res=0;
    for(int i=1;i<100;i++){
        freq[i]=freq[i-1]+freq[i];
        if(freq[i]>freq[res]){
            res=i;
        }
    }
    return res;
}

}

