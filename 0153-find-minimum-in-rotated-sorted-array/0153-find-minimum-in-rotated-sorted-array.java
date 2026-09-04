class Solution {
    public int findMin(int[] nums) {

        int low =0;
        int high = nums.length-2;

        while(low<=high){
            int mid = (high-low)/2+low;
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(nums[low]<=nums[mid]) low=mid+1;
            else high=mid-1;
        }

        return nums[0];
    }
}