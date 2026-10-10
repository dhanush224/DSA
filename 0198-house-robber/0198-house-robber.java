class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++)dp[i]=-1;
        return dfs(0,nums, dp);
    }

    public int dfs(int i, int[] nums, int[] dp){
        if(i==nums.length-1) return dp[i]=nums[i];
        else if(i>nums.length-1) return 0;

        if(dp[i]==-1){
            int rob =nums[i]+dfs(i+2,nums,dp);
            int dontrob = dfs(i+1,nums,dp);
            dp[i]=Math.max(rob,dontrob);
        }

        return dp[i];
    }
}