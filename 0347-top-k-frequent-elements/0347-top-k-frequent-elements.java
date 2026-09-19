class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for(int i=0;i<=nums.length;i++)buckets[i] = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index=0;
        int[] ret = new int[k];
        for(int i=nums.length;i>=0;i--){
            List<Integer> list = buckets[i];
            for(int ele: list) {
                ret[index]=ele;
                index++;
                if(index==k) return ret;
            }
        }
        return ret;
    }
}