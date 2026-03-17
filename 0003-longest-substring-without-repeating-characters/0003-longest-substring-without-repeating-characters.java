class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0) return 0;

        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 1, length=1;
        int i=0;
        int j=0;
        map.put(s.charAt(0),1);

        for(j=1;j<s.length();j++){
            while(map.containsKey(s.charAt(j))){
                map.remove(s.charAt(i));
                i++;
            }
            map.put(s.charAt(j),1);
            if(j-i+1>maxLength) maxLength=j-i+1;
            
        }

        return maxLength;

    }
}