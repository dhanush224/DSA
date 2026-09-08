class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(nums, list, new ArrayList<>(), new boolean[nums.length]);

        return list;        
    }

    public void recursion(int[] nums, List<List<Integer>> list, List<Integer> set, boolean[] pick){
        if(set.size()==nums.length){
            list.add(new ArrayList<>(set));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(pick[i]==false){
                set.add(nums[i]);
                pick[i]=true;
                recursion(nums,list,set,pick);
                set.remove(set.size()-1);
                pick[i]=false;
            }
        }

        return;
    }
}