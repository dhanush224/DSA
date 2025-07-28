class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.size()==3){
                for(Integer key: map.keySet()){
                    map.put(key, map.get(key)-1);
                }

            }
        }
        System.out.println("Map: "+map);
        List<Integer> list = new ArrayList<>();

        for(Integer key: map.keySet()){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==key)count++;
            }
            if(count>(nums.length/3))
                list.add(key);
        }        

        return list;
    }
}