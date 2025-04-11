class Solution {
    public int maxProfit(int[] prices) {

        int prefixMin = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prefixMin) prefixMin = prices[i-1];
            maxProfit = Math.max(maxProfit, (prices[i]-prefixMin));
        }

        return maxProfit;
        
    }
}