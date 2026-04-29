class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ret = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]) st.pop();

            if(st.isEmpty()) ret[i]=-1;
            else ret[i]=st.peek();

            st.push(nums[i]);
        }

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]) st.pop();

            if(st.isEmpty()) ret[i]=-1;
            else ret[i]=st.peek();

            st.push(nums[i]);
        }
        
        return ret;    
    }
}