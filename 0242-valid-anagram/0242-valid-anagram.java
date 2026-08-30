class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int i=0;i<s.length();i++){
            Integer key = (int)s.charAt(i);
            if(map1.containsKey(key)) map1.put(key, map1.get(key)+1);
            else map1.put(key, 1);
        }

        for(int i=0;i<t.length();i++){
            Integer key = (int)t.charAt(i);
            if(map2.containsKey(key)) map2.put(key, map2.get(key)+1);
            else map2.put(key, 1);
        }

        return map1.equals(map2);


       
    }
}