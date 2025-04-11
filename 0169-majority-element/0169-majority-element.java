class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            Integer ele = nums[i];
            Integer val = map.get(ele);
            if(map.containsKey(ele)) map.put(ele, ++val);
            else map.put(nums[i],1);
        }

        for(Integer i: map.keySet()){
            if(map.get(i)>(nums.length/2)) return i;
        }

        return -1;
        
    }
}