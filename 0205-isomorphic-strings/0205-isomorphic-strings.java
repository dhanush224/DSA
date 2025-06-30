class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(s.charAt(0),t.charAt(0));

        for(int i=1;i<s.length();i++){

            if( map.containsKey(s.charAt(i))){
                char c1 = map.get(s.charAt(i));
                char c2 = t.charAt(i);
                if(c1!=c2) return false;
            } else if(map.containsValue(t.charAt(i))){
                return false;
            }
            else map.put(s.charAt(i),t.charAt(i));
        }

        return true;

             
    }
}