class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            Integer freq = count.get(nums[i]);
            // System.out.println("Iteration "+i+": "+ freq);
            if(freq==null) freq=0;
            count.put(nums[i],++freq);
        }

        // System.out.println("Map: "+ count);

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return -1;



    }
}