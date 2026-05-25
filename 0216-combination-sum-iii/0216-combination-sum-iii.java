class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return recursion(ans, list,1,k,n,0);
        
    }

    public List<List<Integer>> recursion(List<List<Integer>> ans, List<Integer> list, int n, int k, int sum, int currSum){
        if(currSum>sum){
            return ans;
        }
        if(currSum==sum && list.size()==k){
            ans.add(new ArrayList(list));
            return ans;
        }
        if(list.size()>=k){
            return ans;
        }
        if(n>9) return ans;

        list.add(n);
        recursion(ans, list, n+1,k,sum, currSum+n);
        list.remove(list.size()-1);
        recursion(ans, list, n+1, k, sum, currSum);
        

        return ans;

    }
}