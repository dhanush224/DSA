class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c=='(') st.push(')');
            else if(c=='{') st.push('}');
            else if(c=='[') st.push(']');
            else{
                if(st.empty()) return false;
                if(st.pop()!=c){
                    return false;
                }
            }

        }

        return st.empty();       
        
    }
}