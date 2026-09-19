class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount+1];
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0) dp[0][t]=t/coins[0];
            else dp[0][t]=Integer.MAX_VALUE;
        }

        for(int i=1;i<coins.length;i++){
            for(int t=0;t<=amount;t++){
                long notpick = dp[i-1][t];
                long pick = Integer.MAX_VALUE;
                if(coins[i]<=t) pick = 1+ dp[i][t-coins[i]];

                dp[i][t]=Math.min(notpick,pick);
            }
        }

        if(dp[coins.length-1][amount]>=Integer.MAX_VALUE) return -1;
        else return (int)dp[coins.length-1][amount];

    }
}