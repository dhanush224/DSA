class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();

        recursion(list, innerList, nums,0);

        return list;
    }

    public void recursion(List<List<Integer>> list, List<Integer> innerList, int[] nums, int i){
        if(i==nums.length){
            list.add(new ArrayList<>(innerList));
            return;
        }

        recursion(list, innerList, nums, i+1);
        innerList.add(nums[i]);
        recursion(list,innerList,nums,i+1);
        innerList.remove(innerList.size()-1);

        return;
    }

}