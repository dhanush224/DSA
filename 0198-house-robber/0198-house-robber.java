class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) dp[i]=-1;
        return recursion(0,nums,dp);
    }

    public int recursion(int i, int[] nums, int[] dp){
        if(i>=nums.length)return 0;

        if(dp[i]==-1){
            int pick = nums[i] + recursion(i+2,nums,dp);
            int notpick = recursion(i+1,nums,dp);
            dp[i] = Math.max(pick,notpick);
        }
        return dp[i];
    }
}