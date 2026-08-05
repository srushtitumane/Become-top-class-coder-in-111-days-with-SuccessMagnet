class Solution {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int max_price=prices[0];
        int profit=0,maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price=Math.min(min_price,prices[i]);
            }
            max_price=prices[i];
            profit=max_price-min_price;
            maxProfit=Math.max(maxProfit,profit);
 
        }
        return maxProfit;
        
    }
}