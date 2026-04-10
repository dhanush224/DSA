class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        recursion(list,innerList, candidates, target, 0, 0);

        return list;

    }    

    public void recursion(List<List<Integer>> list, List<Integer> innerList, int[] candidates, int target, int i, int sum){

        if(sum==target){
            list.add(new ArrayList<>(innerList));
            return;
        }
        if(sum>target || i==candidates.length){
            return;
        }

        innerList.add(candidates[i]);
        recursion(list, innerList, candidates, target, i+1, sum+candidates[i]);

        innerList.remove(innerList.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1]) i++;
        recursion(list, innerList, candidates, target, i+1, sum);

        return;


    }
}