class Solution {
    public long maximumTripletValue(int[] nums) {


        long maxValue=0;
        int preMax=nums[0];
        for(int j=1;j<nums.length-1;j++){
            preMax = Math.max(nums[j-1],preMax);
            for(int k=j+1;k<nums.length;k++){
                long val = preMax-nums[j];
                val*=nums[k];
                maxValue = Math.max(val, maxValue);
            }

        }

        return maxValue;
        
    }
}