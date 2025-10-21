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


        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }

        String str = sb.reverse().toString();
        String str2 = str.substring(0,str.length()-k);
        String result = str2.replaceFirst("^0+(?!$)", "");

        return result;
        
    }
}