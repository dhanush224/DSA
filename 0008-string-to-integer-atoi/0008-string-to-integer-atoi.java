class Solution {
    public int myAtoi(String s) {

        int i=0, sign=1;
        int n=s.length();
        if(n==0) return 0;

        while(i<n && s.charAt(i)==' ')i++;
        if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(i<n && s.charAt(i)=='+')i++;
        while(i<n && s.charAt(i)=='0')i++;
        if(i==n) return 0;
        long val=0;
        int multiplier=1;
        val = recursion(i,val,multiplier,s);
        if(val==Integer.MAX_VALUE){
            return sign*Integer.MAX_VALUE;
        } else if(val==Integer.MIN_VALUE){
            if(sign==-1) return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        else return sign*(int)val;
            
    }

    public long recursion(int i, long val, int m, String s){
        
        if(val>Integer.MAX_VALUE || val<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else if(val==Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(i==s.length()){
            return val;
        }
        Character c = s.charAt(i);
        

        if(Character.isDigit(c)){
            int x = (int)c - 48;
            val=val*m+x;
            if(m==1)m*=10;
            val=recursion(i+1,val,m,s);
        }else return val;

        return val;

    }
}