class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=i+1;
        int maxProfit = 0;
        int least = prices[i];
        while(j<prices.length){
            int profit = prices[j]-prices[i];
            maxProfit=Math.max(profit,maxProfit);
            if(prices[j]<least) {
                i=j;
                least=prices[j];
            }
            j++;
        }

        return maxProfit;
    }
}