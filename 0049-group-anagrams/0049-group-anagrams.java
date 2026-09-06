class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {  
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] arr = new int[26];
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-'a']++;
            }
            String s = Arrays.toString(arr);
            List<String> list = new ArrayList<>();
            if(map.containsKey(s)) list = map.get(s);
            list.add(str);
            map.put(s,list);
        }  

        List<List<String>> ret = new ArrayList<>();
        for(String key: map.keySet()){
            ret.add(map.get(key));
        }    

        return ret;
    }
}