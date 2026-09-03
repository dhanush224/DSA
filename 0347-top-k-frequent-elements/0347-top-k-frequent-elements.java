class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[][] arr = new int[nums.length][2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        } 

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));

        for(int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
            if(pq.size()>k){
                pq.remove();
            }
        }


        int[] ret = new int[k];
        for(int i=0;i<k;i++){
            ret[i]=pq.remove()[0];
        }

        return ret;

    }
}