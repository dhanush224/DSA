class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int maxLength = 1;
        Set<Character> set = new HashSet<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            Character val = s.charAt(i);
            while(set.contains(val)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(val);

            if(set.size()>maxLength) maxLength = set.size();
        }

        return maxLength;
        
    }
}