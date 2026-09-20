class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];

        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }

        int ret = recursion(coins.length-1,coins,amount,dp);

        return ret;
    }

    public int recursion(int i,int[] coins, int amount, int[][] dp){
        if(i==0){
            if(amount%coins[i]==0) return 1;
            else return 0;
        }

        if(dp[i][amount]!=-1) return dp[i][amount];
        int notpick = recursion(i-1,coins,amount,dp);
        int pick = 0;
        if(amount>=coins[i]) pick = recursion(i,coins,amount-coins[i],dp);

        dp[i][amount]=pick+notpick;
        return dp[i][amount];
    }
}