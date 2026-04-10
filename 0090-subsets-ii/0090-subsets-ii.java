class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();

        Arrays.sort(nums);
        recursion(list, innerList, nums, 0);

        return list;
    }

    public void recursion(List<List<Integer>> list, List<Integer> innerList, int[] nums, int i){
        
        if(i==nums.length){
            list.add(new ArrayList<>(innerList));
            return;
        }

        innerList.add(nums[i]);
        recursion(list, innerList, nums,i+1);

        innerList.remove(innerList.size()-1);
        while(i<nums.length-1 && nums[i]==nums[i+1])i++;
        recursion(list, innerList, nums, i+1);

        return;
    }
}