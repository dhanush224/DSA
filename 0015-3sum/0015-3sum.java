class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    list.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while(j<n && nums[j-1]==nums[j])j++;
                }else if(sum>0)k--;
                else j++;
            }
            while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }
        }

        return list;

                
    }
}