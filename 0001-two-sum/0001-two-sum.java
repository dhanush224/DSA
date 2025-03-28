class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ret = {-1,-1};

        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(i!=j &&nums[j]==target-nums[i]){
                    ret[0]=i;
                    ret[1]=j;
                }
                
            }
        }

        return ret;        
    }
}