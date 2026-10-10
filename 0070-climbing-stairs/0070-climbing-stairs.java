class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        return dfs(n,0,dp);

    }
    public int dfs(int n, int curr, int[] dp){
        if(curr==n) return dp[curr]=1;
        else if (curr>n) return 0;

        if(dp[curr]==0){
            int one = dfs(n,curr+1,dp);
            int two = dfs(n,curr+2,dp);
            dp[curr]=one+two;
        }

        return dp[curr];
    }
}