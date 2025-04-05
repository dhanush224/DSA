class Solution {
    public long maximumTripletValue(int[] nums) {

        long maxValue=0;
        int preMax=nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=1;j<nums.length-1;j++){
            preMax = Math.max(nums[j-1],preMax);
            map.put(j, preMax);
        }

         
        int suffixMax = nums[nums.length-1]; 
        for(int j=nums.length-2;j>0;j--){
            suffixMax = Math.max(nums[j+1],suffixMax);
            // System.out.println(suffixMax+" j:"+j);
            long val = map.get(j)-nums[j];
            val *= suffixMax;

            maxValue = Math.max(val, maxValue);



        }

        return maxValue;         
    }
}