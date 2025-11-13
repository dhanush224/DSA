class Solution {
    List<List<Integer>> outerList =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> list = new ArrayList<>();
        printSubsets(0,list,nums);   

        return outerList;     
    }

    public void printSubsets(int i, List<Integer> list, int[] nums) {

        if(i>=nums.length){
            outerList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        printSubsets(i+1,list,nums);
        list.remove(list.size()-1);
        printSubsets(i+1,list,nums);

        return;                       
    }

}