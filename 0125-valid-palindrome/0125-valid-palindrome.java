class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        String new1 = s.toLowerCase();
        System.out.println("The string: "+new1);
        for(int i=0;i<(new1.length())/2;i++){
            if(new1.charAt(i)==(new1.charAt(new1.length()-1-i))){
                continue;
            }
            else
                return false;
        }
        return true;
    }
}