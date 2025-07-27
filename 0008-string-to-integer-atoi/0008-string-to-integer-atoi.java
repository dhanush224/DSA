class Solution {
    public int myAtoi(String s) {

        int i=0;
        int sign=1;
        long ans=0;

        while(i<s.length() && s.charAt(i)==' ')i++;



        if(i==s.length()) return 0;

        if(s.charAt(i)=='+') {
            i++;
        }
        else if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        // System.out.println("i: "+i+ ", sign:"+sign);

        while(i<s.length() && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';
            ans = ans*10 + digit;
            // System.out.println(ans+", "+digit);
            
            if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        // System.out.println("sign:"+sign);


        return (int)(sign*ans);
        
    }
}