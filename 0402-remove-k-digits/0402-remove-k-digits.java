class Solution {
    public String removeKdigits(String num, int k) {

        if(k==num.length()) return "0";

        Stack<Integer> st = new Stack<Integer>();
        int n = num.length();

        for(int i=0;i<n;i++){
            int val = num.charAt(i) - '0';
            while(!st.empty() && val<st.peek() && k!=0){
                st.pop();
                k--;
            }            
            st.push(val);
        }

        while(k!=0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }

        String str = sb.reverse().toString();
        String result = str.replaceFirst("^0+(?!$)", "");

        return result;
        
    }
}