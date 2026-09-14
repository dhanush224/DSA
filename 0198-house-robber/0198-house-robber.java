class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=2;i<n;i++)dp[i]=-1;
        
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            int max= Integer.MIN_VALUE;
            for(int j=i;j>=0;j--){
                if(j>1){
                    int val = (dp[i-j]!=-1)? dp[i-j] : nums[i-j];
                    if(val>max) max=val;
                }
            }
            dp[i]=max+nums[i];
        }

        return Math.max(dp[n-1],dp[n-2]);
    }
}