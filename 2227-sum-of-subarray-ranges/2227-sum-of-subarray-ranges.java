class Solution {
    public long subArrayRanges(int[] nums) {

        long sum=0;
        sum= sumMaxSubArray(nums) - sumMinSubArray(nums);

        return sum;        
    }

    public long sumMinSubArray(int[] nums) {
        long sum=0;

        int[] pse = pse(nums);
        int[] nsee = nsee(nums);

        for(int i=0;i<nums.length;i++){
            long left = i-pse[i];
            long right = nsee[i]-i;

            sum=(sum+ ((left*right)*nums[i]));
        }
        return sum;        
    }

    public long sumMaxSubArray(int[] nums) {
        long sum=0;
        int[] pge = pge(nums);
        int[] ngee = ngee(nums);

        for(int i=0;i<nums.length;i++){
            long left = i-pge[i];
            long right = ngee[i]-i;

            sum=(sum +((left*right)*nums[i]));
        }
        return sum;        
    }

    public int[] pse(int[] nums){
        
        int n = nums.length;
        int[] ret = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && nums[st.peek()]>=nums[i]) st.pop();

            ret[i] = (st.empty()) ? -1:st.peek();
            st.push(i);
        }

        return ret;
    }

    public int[] nsee(int[] nums){

        int n = nums.length;
        int[] ret = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && nums[st.peek()]>nums[i]) st.pop();

            ret[i] = (st.empty()) ? n:st.peek();
            st.push(i);
        }

        return ret;
    }

    public int[] pge(int[] nums){
        
        int n = nums.length;
        int[] ret = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && nums[st.peek()]<=nums[i]) st.pop();

            ret[i] = (st.empty()) ? -1:st.peek();
            st.push(i);
        }

        return ret;
    }

    public int[] ngee(int[] nums){

        int n = nums.length;
        int[] ret = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.empty() && nums[st.peek()]<nums[i]) st.pop();

            ret[i] = (st.empty()) ? n:st.peek();
            st.push(i);
        }

        return ret;
    }

    
}