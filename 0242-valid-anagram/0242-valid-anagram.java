class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        for(int i=0;i<s.length();i++){
            Integer key = (int)s.charAt(i);
            map1.put(key, map1.getOrDefault(key,0)+1);
        }

        for(int i=0;i<t.length();i++){
            Integer key = (int)t.charAt(i);
            if(!map1.containsKey(key)) return false;
            map1.put(key, map1.get(key)-1);            
        }

        for(int key: map1.keySet()){
            if(map1.get(key)!=0) return false;
        }

        return true;

       
    }
}