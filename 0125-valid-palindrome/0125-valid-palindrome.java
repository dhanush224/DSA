class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) sb.append(s.charAt(i));
        }

        if(sb.length()<2) return true;
        String t = sb.toString();

        int i=0;
        int j=t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}