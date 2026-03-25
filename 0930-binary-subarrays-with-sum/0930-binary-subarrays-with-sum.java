class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum=0;
        int total=0;
        int n = nums.length;

        int i=0,j=0;

        while(j<n){
            sum+=nums[j];
            while(sum>goal && i<=j){
                sum-=nums[i];
                i++;
            }
            total+=j-i+1;
            j++;
        }

        sum=0;
        i=0;j=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=goal && i<=j){
                sum-=nums[i];
                i++;
            }
            total-=j-i+1;
            j++;
        }
        return total;        
    }
}