class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) dp[i]=-1;
        return recursion(0,nums,dp,0);        
    }

    public int recursion(int i, int[] nums, int[] dp, int flag){
        if(nums.length==1) return nums[i];
        if(nums.length==2) return Math.max(nums[i], nums[i+1]);
        if(i>=nums.length) return 0;

        if(dp[i]==-1){
        int pick=-1;
        if(i==0){
            flag=1;
            pick = recursion(i+2,nums,dp,flag);
            flag=0;
        }else{
            pick = nums[i] + recursion(i+2,nums,dp,flag);
        }

        if(i==nums.length-1 && flag==1){
             pick = Math.max(nums[i],nums[0]) + recursion(i+2,nums,dp,flag);
        }else if(i==nums.length-2 && flag==1) pick = nums[0]+nums[i] + recursion(i+2,nums,dp,flag);

        if(i==0){
            dp = new int[nums.length];
            for(int j=0;j<nums.length;j++) dp[j]=-1;
        }
        int notpick = recursion(i+1,nums,dp,flag);
        dp[i] = Math.max(pick,notpick);            
        
        }
        
        return dp[i];
    }
}