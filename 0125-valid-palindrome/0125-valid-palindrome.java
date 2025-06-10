class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<=r){
            if(((int)s.charAt(l)>=48 && (int)s.charAt(l)<=57) || ( (int)s.charAt(l)>=65 && (int)s.charAt(l)<=90 ) || ((int)s.charAt(l)>=97 && (int)s.charAt(l)<=122) ){
                if(((int)s.charAt(r)>=48 && (int)s.charAt(r)<=57) || ( (int)s.charAt(r)>=65 && (int)s.charAt(r)<=90 ) || ((int)s.charAt(r)>=97 && (int)s.charAt(r)<=122) ){
                    if((int)s.charAt(l)==(int)s.charAt(r) || ((int)s.charAt(l)-32==(int)s.charAt(r) && ((int)s.charAt(r)>=65 && (int)s.charAt(r)<=90 ))|| ( (int)s.charAt(l)==(int)s.charAt(r)-32 && (int)s.charAt(l)>=65 && (int)s.charAt(l)<=90 ) ){
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
}