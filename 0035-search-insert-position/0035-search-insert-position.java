class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int largestIndex = -1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                if(largestIndex<mid) largestIndex = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return largestIndex+1;
    }
}