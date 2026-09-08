class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(nums, list, new LinkedHashSet<>());

        return list;        
    }

    public void recursion(int[] nums, List<List<Integer>> list, Set<Integer> set){
        if(set.size()==nums.length){
            list.add(new ArrayList<>(set));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) continue;
            recursion(nums,list,set);
            set.remove(nums[i]);
        }

        return;
    }
}