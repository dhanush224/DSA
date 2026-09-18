class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount+1];
        long ans = recursion(coins.length-1,coins,amount,dp);
        if(ans>=Integer.MAX_VALUE) return -1;
        else return (int)ans;
    }

    public long recursion(int i, int[] coins, int amount,long[][] dp){
        if(i==0){
            if(amount%coins[i]==0) return amount/coins[i];
            else return Integer.MAX_VALUE;
        }

        if(dp[i][amount]!=0) return dp[i][amount];
        long notpick = recursion(i-1,coins,amount,dp);
        long pick = Integer.MAX_VALUE;
        if(coins[i]<=amount) pick = 1+ recursion(i,coins,amount-coins[i],dp);
        dp[i][amount]=Math.min(pick,notpick);
        return dp[i][amount];
    }
}