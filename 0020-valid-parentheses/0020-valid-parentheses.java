class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                st.push(s.charAt(i));
            }else{
                try{
                    if(!map.get(st.peek()).equals(s.charAt(i))) return false;
                    st.pop();
                }catch(Exception e){
                    return false;
                }
                
            }
        }

        if(st.size()==0) return true;
        else return false;


        
        
    }
}