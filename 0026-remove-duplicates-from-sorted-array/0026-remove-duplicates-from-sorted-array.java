class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Integer conv = new Integer(nums[i]);
            if(!list.contains(conv)){
                list.add(conv);
            }
        }

        for(int i=0;i<list.size();i++){
            int replaceValue = list.get(i);
            nums[i]=replaceValue;
        }


        return list.size();
    }
}