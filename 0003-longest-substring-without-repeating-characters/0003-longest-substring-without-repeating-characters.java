class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();

        int i=0;
        int maxLength =0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j))+1, i);
            }
            map.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j-i+1);
        }

        return maxLength;

    }
}