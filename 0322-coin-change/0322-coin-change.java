class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount+1];
        long count = dfs(coins.length-1,coins,amount,dp);
        if(count>=Integer.MAX_VALUE) return -1;
        else return (int)count;
        
    }

    public long dfs(int i, int[] coins, int amount, long[][] dp){

        if(i==0){
            if(amount%coins[i]==0){
                dp[i][amount]=amount/coins[i];
                return dp[i][amount];
            } 
            else return Integer.MAX_VALUE;
        }
        

        long nottake = Integer.MAX_VALUE;
        if(i>0){
            if(dp[i-1][amount]!=0) nottake = dp[i-1][amount];
            else nottake = dfs(i-1,coins,amount,dp);
        }

        long take = Integer.MAX_VALUE;
        if(coins[i]<=amount) {
            if(dp[i][amount-coins[i]]!=0) take = 1+dp[i][amount-coins[i]];
            else take = 1+ dfs(i,coins,amount-coins[i],dp);
        }

        dp[i][amount]=Math.min(nottake,take);
        return dp[i][amount];


    }
}