class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int prev=nums[0];
        int prev2= prev;
        for(int i=1;i<nums.length;i++){
            int l = nums[i];
            if(i>1) l+=prev2;
            int r = prev;
            prev2=prev;
            prev=Math.max(l,r);
        }

        return prev;
    }
}