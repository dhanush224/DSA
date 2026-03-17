class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int maxLength = 1;
        Set<Integer> set = new HashSet<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            Integer val = (int)s.charAt(i);
            while(set.contains(val)){
                Integer val2 = (int)s.charAt(j);
                set.remove(val2);
                    j++;
                }
            set.add(val);

            if(set.size()>maxLength) maxLength = set.size();
        }

        return maxLength;
        
    }
}