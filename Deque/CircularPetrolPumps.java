package Deque;

public class CircularPetrolPumps {
    public static void main(String[] args){
    int[] petrol = {8,9,4};
    int[] dist = {5,10,12};
    System.out.println(firstPetrolPump(petrol, dist));
    }

    /*static int firstPetrolPump(int petrol[], int dist[]){
        int n = petrol.length;
        for(int start=0;start<n;start++){
            int curr_petrol=0;
            int end = start;
            while(true){
                curr_petrol += petrol[end]-dist[end];
                if(curr_petrol<0)
                    break;
                end = (end+1)%n;
                if(end==start)
                    return start+1;
               
            }
        }
        return -1;
    }*/

    static int firstPetrolPump(int petrol[], int dist[]){
        int n  = petrol.length;
        int start=0;
        int curr_petrol = 0;
        int prev_pet = 0;
        for(int i=0;i<n;i++){
            curr_petrol += petrol[i]-dist[i];
            if(curr_petrol < 0){
                start = i+1;
                prev_pet += curr_petrol;
                curr_petrol=0;
            }
        }
        return (curr_petrol + prev_pet)>=0?(start + 1):-1;
    }
}
