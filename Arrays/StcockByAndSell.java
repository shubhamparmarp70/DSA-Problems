package Arrays;

public class StcockByAndSell {
    public static void main(String[] args){
    int price[] = {10,20,30,40,50,60};
    int start=0;
    int end = price.length-1;
    System.out.println(maxProfit(price));
    }

    /*  static int maxProfit(int price[], int start, int end){
        if(start>=end){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(price[j]>price[i]){
                    int curr_profit=price[j]-price[i] + maxProfit(price,start,i-1)+maxProfit(price,j+1,end);
                     profit = Math.max(profit,curr_profit);
                }
            }
           
        }
        return profit;
    }
    */

    static int maxProfit(int price[]){
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit+=price[i]-price[i-1];
            }
        }
        return profit;
    }
   
}
