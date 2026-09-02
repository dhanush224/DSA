class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        } 

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=nums.length;i++)list.add(new ArrayList<>());

        for(int key: map.keySet()){
            list.get(map.get(key)).add(key);
        }

        int[] ret = new int[k];
        int j=0;
        for(int i=list.size()-1;i>=0;i--){
            for(int ele: list.get(i)){
                ret[j]=ele;
                j++;
                if(j==k) break;
            }
            if(j==k) break;
        }

        return ret;


    }
}