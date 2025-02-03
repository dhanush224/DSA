class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int target = -1;
        int low = 0, high = nums.length-1;
        if(nums.length==1) return nums[0];
        int size = nums.length-1;
        for(int i=1;i<nums.length;i=i+2){
            if(nums[i-1]!=nums[i]) return nums[i-1];
            

        }

        return nums[size];

        
    }
}