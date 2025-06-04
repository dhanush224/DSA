class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }

        int maxLength = 1;
        Map<Integer,Integer> set = new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            Integer val = (int)s.charAt(i);
            if(!set.containsValue(val)){
                set.put(i,val);
                
            }else{
                while(set.containsValue(val)){
                    set.remove(j);
                    j++;
                }
                set.put(i, val);
                
            }

            if(set.size()>maxLength) maxLength = set.size();
        }

        return maxLength;
        
    }
}