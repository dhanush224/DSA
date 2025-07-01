class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s=strs[0];

        for(String t: strs){
            while(t.indexOf(s)!=0){
                s=s.substring(0, s.length()-1);
            }
        }

        return s;        
    }
}