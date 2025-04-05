class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
            if(i+1==nums.length-1) if(nums[i+1]>nums[0]) count++;
            // if(nums[i+1]>largest) return false;
            if(count>1) return false;
        }

        return true;

    }
}