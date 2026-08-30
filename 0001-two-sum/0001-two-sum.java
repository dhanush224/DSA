class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        int[] ret = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int j=map.get(target-nums[i]);
                if(i!=j){
                    ret[0]=i;
                    ret[1]=j;
                    return ret;
                }
            }
        } 

        return ret;  
    }
}