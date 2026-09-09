class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0) return 0;

        int[] freq = new int[26];
        int maxFrequency =0;
        int maxLength=0;

        int i=0;
        for(int j=0;j<s.length();j++){
            maxFrequency = Math.max(maxFrequency, ++freq[s.charAt(j)-'A']);

            if((j-i+1)-maxFrequency>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }

            maxLength = Math.max(maxLength,(j-i+1));
        }
        return maxLength;
    }

}