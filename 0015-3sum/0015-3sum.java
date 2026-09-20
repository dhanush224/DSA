class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        int k=nums.length-1;
        for(int i=0;i<nums.length-2;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> innerList = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                    list.add(innerList);
                    while(j+1<nums.length && nums[j]==nums[j+1]) j++;
                    j++;
                    k--;
                }else if(sum>0) k--;
                else j++;
            }
            while(i+1<nums.length && nums[i]==nums[i+1])i++;
        }

        return list;

    }
}