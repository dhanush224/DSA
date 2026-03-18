class Solution {
    public int longestSubarray(int[] nums) {

        int i =0;
        int zeroes=0;
        int longest=0;

        for(int j=0;j<nums.length;j++){
            while(nums[j]==0 && zeroes==1){
                if(nums[i]==0) zeroes--;
                i++;
            }
            if(nums[j]==0) zeroes++;
            longest = Math.max(longest,j-i+1);
        }

        return longest-1;
        
    }
}