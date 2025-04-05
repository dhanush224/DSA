class Solution {
    public long maximumTripletValue(int[] nums) {

        long maxValue=0;
        int prefixMax = nums[0];
        long maxDiff = 0;

        for(int k=1;k<nums.length;k++){
            if(nums[k-1]>prefixMax){
                prefixMax = nums[k-1];
            }
            // System.out.println("PrefixMax: "+prefixMax);
            if(prefixMax-nums[k-1]> maxDiff)maxDiff = prefixMax-nums[k-1];
            // System.out.println("MaxDiff:"+maxDiff);
            // System.out.println("Index: "+k+", Prefix:"+ prefixMax+ ", Suffix: "+ suffixMin);
            long val = maxDiff*nums[k];
            // System.out.println("Value:"+val);

            maxValue = Math.max(val, maxValue);
        }

        return maxValue;         
    }
}