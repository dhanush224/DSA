class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] arr = {-1,-1};

        for(int i=0;i<nums.length;i++){            
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                arr[0] = i;
                arr[1] = map.get(target-nums[i]);
                return arr;
            }
        }
        return arr;        
    }
}