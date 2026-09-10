class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();
        if(s.length()%2!=0) return false;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(')st.add(')');
            else if(c=='{') st.add('}');
            else if(c=='[')st.add(']');
            else{
                if(st.size()==0) return false;
                if(st.pop()!=c) return false;
            }
        }    


        return st.isEmpty();
        
    }
}