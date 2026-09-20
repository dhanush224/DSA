class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];

        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                dp[i][j]=-1;
            }
        }

        for(int j=0;j<=amount;j++){
            if(j%coins[0]==0)dp[0][j]=1;
            else dp[0][j]=0;
        }

        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                int notpick = dp[i-1][j];
                int pick = 0;
                if(j>=coins[i])pick = dp[i][j-coins[i]];
                if(pick<0) pick =0;
                if(notpick<0) notpick=0;
                dp[i][j]=pick+notpick;
            }
        }
        return dp[coins.length-1][amount];
    }

}