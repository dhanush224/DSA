class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum=0;
        int total=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==goal)total++;
                if(sum>goal)break;
            }
        }
        return total;        
    }
}