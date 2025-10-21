class Solution {
    public String removeKdigits(String num, int k) {


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

        int start=0;
        while(start<str.length() && str.charAt(start)=='0') start++;

        String result = str.substring(start);

        return (result.isEmpty())? "0" : result;
        
    }
}