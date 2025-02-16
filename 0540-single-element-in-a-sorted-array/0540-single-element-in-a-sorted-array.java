class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int target = -1;
        int low = 1, high = nums.length-1;
        if(nums.length==1) return nums[0];

        if(nums.length==1) return nums[0];
        else{
            if(nums[0]!=nums[1]) return nums[0];
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(mid%2==0){
                if(nums[mid]==nums[mid-1]) high=mid-1;
                else if(mid+1!=nums.length){
                    if(nums[mid]!=nums[mid+1]) return nums[mid];
                    else low=mid+1;
                }
                else return nums[mid];
            }else{
                if(nums[mid]==nums[mid-1]) low=mid+1;
                else high = mid-1;
            }
        }


        return -1;

        
    }
}