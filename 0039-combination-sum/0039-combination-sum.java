class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        recursion(0,candidates.length,0,candidates,target,outerList,list);
        return outerList;
    }

    public void recursion(int i, int size, int sum, int[] candidates, int target, List<List<Integer>> outerList, List<Integer> list) {
        if(sum>target){
            return;            
        }else if(sum==target){
            outerList.add(new ArrayList<>(list));
            return;
        }

        if(i==size){
            if(sum==target){
                outerList.add(new ArrayList<>(list));
                return;
            }else return;
        }

        list.add(candidates[i]);
        sum+=candidates[i];
        recursion(i,size,sum,candidates,target,outerList, list);

        list.remove(list.size()-1);
        sum-=candidates[i];
        recursion(i+1,size,sum,candidates,target,outerList, list);
        return;        
    }
}