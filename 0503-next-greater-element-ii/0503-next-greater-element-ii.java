class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] ret = new int[nums.length];
        Stack<Integer> s = new Stack<>();

        int n=nums.length;
        for(int i=(2*n-1);i>=0;i--){
            while(!s.empty() && s.peek()<=nums[i%n]) s.pop();

            if(i<n){
                if(s.empty()) ret[i]=-1;
                else ret[i]=s.peek();
            }            

            s.push(nums[i%n]);
        }

        return ret;
    }
}