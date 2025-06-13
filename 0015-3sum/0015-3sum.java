class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashSet<List<Integer>> set = new HashSet<>();

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }


        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(map.containsKey(-sum) && map.get(-sum)!=i && map.get(-sum)!=j){
                    ArrayList<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[map.get(-sum)]);
                    java.util.Collections.sort(innerList);
                    set.add(innerList);
                }

            }
        }

        List<List<Integer>> ans = new ArrayList<>(set);


        return ans;
        


        
    }
}