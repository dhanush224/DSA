class Solution {
    public int search(int[] nums, int target) {
        int low =0, high = nums.length-2;

        int least =0;
        while(low<=high){
            int mid = (high-low)/2 + low;
            if(nums[mid]>nums[mid+1]) {
                least = mid+1;
                break;
            }else if(nums[low]<=nums[mid])low=mid+1;
            else high=mid-1;
        }
System.out.println(least);
        low=0;
        high=nums.length-1;
            if(nums[least]<=target && target<=nums[high]){
                low=least;
                while(low<=high){
                    int mid=(high-low)/2 + low;
                    if(nums[mid]==target) return mid;
                    else if(nums[mid]<target) low = mid+1;
                    else high=mid-1;
                }
            }else if(nums[low]<=target){
                high=least-1;
                while(low<=high){
                    int mid = (high-low)/2+low;
                    if(nums[mid]==target) return mid;
                    else if(nums[mid]<target) low = mid+1;
                    else high=mid-1;
                }
            }
            return -1;
    }
}