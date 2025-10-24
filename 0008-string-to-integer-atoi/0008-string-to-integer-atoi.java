class Solution {
    int i=0,whitespace=0,sign=1,num=0;
    long ans=0;
    public int myAtoi(String s) {

        if(i<s.length() && whitespace==0 && s.charAt(i)==' '){
            i++;
            myAtoi(s);
        }else if(i<s.length() && whitespace==0 && s.charAt(i)!=' '){
            whitespace=1;
            myAtoi(s);
        }else if(i<s.length() && whitespace==1 && s.charAt(i)=='-' && num==0){
            sign=-1;
            i++;
            num=1;
            myAtoi(s);
        }else if(i<s.length() && whitespace==1 && s.charAt(i)=='+' && num==0){
            sign=1;
            i++;
            num=1;
            myAtoi(s);
        }else if(i<s.length() && whitespace==1 && Character.isDigit(s.charAt(i))){
            num=1;
            int digit = s.charAt(i) - '0';
            ans=ans*10+digit;
            if(sign*ans>=Integer.MAX_VALUE) {
                ans=Integer.MAX_VALUE;
                return (int)ans;
            }
            else if(sign*ans<=Integer.MIN_VALUE){
                ans= Integer.MIN_VALUE;
                return (int)ans;
            }
            i++;
            myAtoi(s);
        }else if(i<s.length() && num==1 && !Character.isDigit(s.charAt(i))){

            return sign*(int)ans;            
        }


        if(ans>=Integer.MAX_VALUE) return sign*Integer.MAX_VALUE;


        return sign*(int)ans;      
    }
}