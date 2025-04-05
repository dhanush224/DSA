class Solution {
    public long maximumTripletValue(int[] nums) {

        long maxValue=0;
        int prefixMax = nums[0];
        long maxDiff = 0;

        for(int k=1;k<nums.length;k++){
            if(nums[k-1]>prefixMax){
                prefixMax = nums[k-1];
            }
            if(prefixMax-nums[k-1]> maxDiff)maxDiff = prefixMax-nums[k-1];
            long val = maxDiff*nums[k];

            maxValue = Math.max(val, maxValue);
        }

        return maxValue;         
    }
}