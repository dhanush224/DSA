class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int l = nums[i];
            if(i>1) l+=dp[i-2];
            int r = dp[i-1];
            dp[i]=Math.max(l,r);
        }

        return dp[n-1];
    }
}