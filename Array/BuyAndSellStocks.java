package Array;

public class BuyAndSellStocks {
    public static int buyAndSellstocks( int price[]){
        //profit = selling price - buying price
        //selling price  (miximum)
        //buying price (minimum)
        //buyPrice = +infinite  track lowest buying price
        //stock
        //loop  buyprice < sellingprice
        //      p= sp-bp
        //      maximum profit

        //
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0 ; i<price.length; i++){
            if(buyPrice<price[i]){
                int profit = price[i] -buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]=  {7,1,5,3,16,4};
        System.out.println(buyAndSellstocks(price));
        
    }
}