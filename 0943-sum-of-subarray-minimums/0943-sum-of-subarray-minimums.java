class Solution {
    public int sumSubarrayMins(int[] arr) {

        int[] pse = pse(arr);
        int[] nsee = nsee(arr);
        int n = arr.length;
        int mod = (int)Math.pow(10,9) +7;

        long sum = 0;
        for(int i=0;i<n;i++){
            long left = i-pse[i];
            long right = nsee[i]-i;
            sum= (sum + (left*right*arr[i]) %mod) %mod;
        }

        return (int)sum;
        
    }

    public int[] pse(int[] array){
        
        Stack<Integer> st = new Stack<>();

        int n = array.length;
        int[] ret = new int[n];
        for(int i=0;i<n;i++){

            while(!st.empty() && array[st.peek()]>=array[i]) st.pop();

            if(st.empty()) ret[i]=-1;
            else ret[i]=st.peek();

            st.push(i);

        }

        return ret;

    }

    public int[] nsee(int[] array){

        Stack<Integer> st = new Stack<>();
        
        int n = array.length;
        int[] ret = new int[n];
        for(int i=n-1;i>=0;i--){

            while(!st.empty() && array[st.peek()]>array[i]) st.pop();

            if(st.empty()) ret[i]=n;
            else ret[i]=st.peek();

            st.push(i);

        }

        return ret;

    }
}