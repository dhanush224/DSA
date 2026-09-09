class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int m = s1.length();
        int[] freq = new int[26];
        for(int i=0;i<m;i++) freq[s1.charAt(i)-'a']++;

        int[] freq2 = new int[26];
        int i=0;
        for(int j=0;j<s2.length();j++){
            freq2[s2.charAt(j)-'a']++;
            if(j-i+1>m){
                freq2[s2.charAt(i)-'a']--;
                i++;
            }
            if(j-i+1==m){
                for(int k=0;k<26;k++){
                    if(freq[k]!=freq2[k]) break;
                    if(k==25) return true;
                }
            }
        }

        return false;

        
    }
}