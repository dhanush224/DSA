class Solution {
    public int sumSubarrayMins(int[] arr) {

        Stack<Integer> st = new Stack<>();
        int MOD = (int)Math.pow(10,9) +7;
        long res=0;

        int n = arr.length;
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[st.peek()]>arr[i]){
                int j=st.pop();
                long left = (!st.empty()) ? j-st.peek() : j+1;
                long right = i-j;
                res=(res+(left*right*arr[j]%MOD))%MOD;
            }
            st.push(i);
        }

        while(!st.empty()){
            int j=st.pop();
            int prev = (!st.empty()) ? st.peek(): -1;
            long left = j-prev;
            long right = n-j;
            res=(res+(left*right*arr[j]%MOD))%MOD;
        }

        return (int)res;
    }
}