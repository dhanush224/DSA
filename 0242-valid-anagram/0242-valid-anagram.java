class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sum1 = new int[s.length()];
        int[] sum2 = new int[t.length()];

        for(int i=0;i<s.length();i++){
           sum1[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sum2[i]=t.charAt(i);
        }
        Arrays.sort(sum1);
        Arrays.sort(sum2);
        for(int i=0;i<sum1.length;i++){
            if(!(sum1[i]==sum2[i])){
                return false;
            }
        }
        return true;
    }
}