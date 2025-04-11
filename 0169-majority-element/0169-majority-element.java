class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxVal = 0;
        int maxEle = nums[0];
        for(int i=0;i<nums.length;i++){
            Integer ele = nums[i];
            Integer val = map.get(ele);
            if(map.containsKey(ele)){
                map.put(ele, ++val);
                if(val>maxVal){
                    maxVal = val;
                    maxEle = ele;
                }
                
            } 
            else map.put(nums[i],1);
        }

        return maxEle;
        
    }
}