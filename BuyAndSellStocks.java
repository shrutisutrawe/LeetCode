package Leetcode;

public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int maxProfit = 0 , minBuy = Integer.MAX_VALUE;
        for(int i =0; i < prices.length; i++){
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }else if(prices[i] - minBuy > maxProfit){
                maxProfit = prices[i] - minBuy;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
