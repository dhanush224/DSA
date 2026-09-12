class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        // if(nums.length==2) return Math.max(nums[0], nums[i+1]);

        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) dp[i]=-1;

        int[] dp2 = new int[nums.length];
        for(int i=0;i<nums.length;i++) dp2[i]=-1;
        
        return Math.max(recursion(0,nums.length-1,nums,dp), recursion(1,nums.length,nums,dp2));        
    }

    public int recursion(int i, int end, int[] nums, int[] dp){

        if(i>=end) return 0;

        if(dp[i]==-1){
        int pick= nums[i] + recursion(i+2,end,nums,dp);
        int notpick = recursion(i+1,end,nums,dp);
        dp[i] = Math.max(pick,notpick);            
        }
        return dp[i];
    }
}