class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                Integer val = map.get(nums[i]);
                map.put(nums[i], val+1);
            }else map.put(nums[i],1);
        }
        List<Integer> list = new ArrayList<>();

        for(Integer key: map.keySet()){

            
            int oneThird = nums.length/3;
            
            if(map.get(key)>oneThird){
                list.add(key);
            }
        }

        return list;
    }
}