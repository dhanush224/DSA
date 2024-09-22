class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            Integer ele = Integer.valueOf(nums[i]);
            if(!(arr.containsKey(ele))){
                arr.put(ele, 1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}