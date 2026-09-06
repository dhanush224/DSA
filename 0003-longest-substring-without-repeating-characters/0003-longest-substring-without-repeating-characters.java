class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int i=0;
        int maxLength =0;
        int n = s.length();
        for(int j=0;j<n;j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxLength = Math.max(maxLength, j-i+1);
        }

        return maxLength;

    }
}