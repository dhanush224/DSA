class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ones = 0, maxOnes = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) ones++;
            else ones=0;
            if(ones>maxOnes) maxOnes=ones;
        }
        return maxOnes;
    }
}