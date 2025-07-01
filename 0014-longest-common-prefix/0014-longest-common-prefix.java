class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s="";

        for(int i=0;i<strs[0].length();i++){
            for(String j: strs){
                if(i==j.length() || strs[0].charAt(i)!=j.charAt(i)) 
                    return s;
            }
            s += strs[0].charAt(i);
        }

        return s;
        
    }
}