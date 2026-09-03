class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++){
            if((t.charAt(i)>='a' && t.charAt(i)<='z') || (t.charAt(i)>='0'&&t.charAt(i)<='9')) sb.append(t.charAt(i));
        }

        t= sb.toString();
        int j=t.length()-1;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!=(t.charAt(j))){
                return false;
            }
            j--;
            if(i>j) break;
        }

        return true;
    }
}