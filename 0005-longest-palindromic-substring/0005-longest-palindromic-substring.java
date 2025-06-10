class Solution {
    public String longestPalindrome(String s) {
        int maxLength=0;
        String s1 = "";
        for(int i=0;i<s.length();i++){
            int l=i, r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxLength){
                    s1 = s.substring(l,r+1);
                    maxLength = r-l+1;
                }                  
                l-=1;
                r+=1;                
            }
            l=i; r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1>maxLength){
                    s1 = s.substring(l,r+1);
                    maxLength = r-l+1;
                }       
                l-=1;
                r+=1;                
            }
        }

        return s1;
        
        
    }
}