class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(map1.containsKey(key)) map1.put(key, map1.get(key)+1);
            else map1.put(key, 1);
        }

        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(map2.containsKey(key)) map2.put(key, map2.get(key)+1);
            else map2.put(key, 1);
        }

        return map1.equals(map2);


       
    }
}