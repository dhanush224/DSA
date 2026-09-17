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
        
        if(dp[i][amount]!=0) return dp[i][amount];
        long nottake = Integer.MAX_VALUE;    
        nottake = dfs(i-1,coins,amount,dp);
        

        long take = Integer.MAX_VALUE;
        if(coins[i]<=amount) {
            take = 1+ dfs(i,coins,amount-coins[i],dp);
        }

        dp[i][amount]=Math.min(nottake,take);
        return dp[i][amount];


    }
}