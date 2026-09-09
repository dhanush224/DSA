class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        recursion(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void recursion(List<List<Integer>> list, List<Integer> es, int[] nums, int i){
        if(i==nums.length){
            list.add(new ArrayList<>(es));
            return;
        }

        es.add(nums[i]);
        recursion(list,es,nums,i+1);
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        es.remove(es.size()-1);
        recursion(list,es,nums,i+1);

    }
}