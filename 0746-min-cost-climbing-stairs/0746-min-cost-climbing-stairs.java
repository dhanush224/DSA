class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];
        for(int i=0;i<cost.length;i++) dp[i]=-1;

        return Math.min(recursion(0,cost,dp),recursion(1,cost,dp));        
    }

    public int recursion(int i, int[] cost, int[] dp){

        if(i>=cost.length) return 0;

        if(dp[i]==-1){
            int step1 = cost[i] + recursion(i+1,cost,dp);
            int step2 = cost[i] + recursion(i+2,cost,dp);
            dp[i]= Math.min(step1,step2);
        }

        return dp[i];
    }
}