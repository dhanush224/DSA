class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else{
                int val = map.get(nums[i]);
                map.put(nums[i],++val);                
            } 
        }

        int max = 1;
        for(Integer i: map.values()){
            if(i>max){
                max=i;
            }
        }

        for(Integer i: map.keySet()){
            if(map.get(i)==max) return i;
        }

        return -1;

    }
}