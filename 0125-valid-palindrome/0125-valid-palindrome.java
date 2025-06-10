class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0, r=s.length()-1;
        while(l<=r){
            if(isAlphaNumeric1(s.charAt(l))){
                if(isAlphaNumeric1(s.charAt(r)) ){
                    if((int)s.charAt(l)==(int)s.charAt(r) ){
                        l++;
                        r--;
                    }else{
                        return false;
                    }

                }else{
                    r--;
                }

            }else{
                l++;
            }
        }
        return true;
        
    }

    public boolean isAlphaNumeric1(Character c){
        if(((int)c>=48 && (int)c<=57) || ( (int)c>=65 && (int)c<=90 ) || ((int)c>=97 && (int)c<=122) ){
            return true;
        }else{
            return false;
        }

    }
}