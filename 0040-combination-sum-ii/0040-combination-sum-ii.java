class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(list, innerList, candidates, 0, target, 0);

        return list;  
    }

    public void recursion(List<List<Integer>> list, List<Integer> innerList, int[] candidates, int i, int target, int sum){

        if(sum==target){
            list.add(new ArrayList<>(innerList));
            return;
        }
        if(sum>target || i==candidates.length) return;
        
        innerList.add(candidates[i]);
        recursion(list, innerList, candidates, i+1, target, sum+candidates[i]);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1])i++;
        innerList.remove(innerList.size()-1);
        recursion(list,innerList,candidates,i+1,target, sum);

        return;
    }

}