class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> outerList =new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        printSubsets(0,list,nums,outerList);   

        return outerList;     
    }

    public void printSubsets(int i, List<Integer> list, int[] nums, List<List<Integer>> outerList) {

        if(i==nums.length){
            outerList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        printSubsets(i+1,list,nums,outerList);
        list.remove(list.size()-1);
        printSubsets(i+1,list,nums,outerList);


    }

}