package Array;

public class Assignment3 {
    public static int buyAndsell( int StockPrice[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit= 0;

        for(int i = 0; i<StockPrice.length; i++){
            if(buyPrice< StockPrice[i]){
                int profit = StockPrice[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = StockPrice[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int StockPrice[]= {7,8,1,4,9,2,10,13};
        System.out.println(buyAndsell(StockPrice));
    }
}
