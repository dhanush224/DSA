class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i=0,j=0;
        int n = nums.length;
        int sum=0;
        int minLength=n+1;
        
        for(j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target && i<=j){
                minLength=Math.min(minLength,j-i+1);
                sum-=nums[i];
                i++;
            }
        }

        if(minLength==n+1) return 0;
        else return minLength;                
    }
}