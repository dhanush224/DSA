class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int total=0;

        int sum=0;
        int i=0,j=0;
        int n = nums.length;

        while(j<n){
            sum+=nums[j]%2;
            while(sum>k && i<=j){
                sum-=nums[i]%2;
                i++;
            }
            total+=j-i+1;
            j++;
        }

        sum=0;
        j=0;
        i=0;
        while(j<n){
            sum+=nums[j]%2;
            while(sum>=k && i<=j){
                sum-=nums[i]%2;
                i++;
            }
            total-=j-i+1;
            j++;
        }

        
        return total;
        
    }
}