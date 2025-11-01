class Solution {
    long MOD = (int)Math.pow(10,9)+7;
    public int countGoodNumbers(long n) {
        long oddN = (n+1)/2;
        long evenN = n/2;

        return (int)(five(oddN)*four(evenN)%MOD);
                      
    }

    public long five(long n){
        int MOD = (int)Math.pow(10,9)+7;

        if(n==1) return 5;
        if(n==0) return 1;

        long res = five(n/2)%MOD;
        res = (res*res)%MOD;
        return (n%2==0)? res:5*res%MOD;

    }

    public long four(long n){
        int MOD = (int)Math.pow(10,9)+7;
        
        if(n==1) return 4;
        if(n==0) return 1;

        long res = four(n/2)%MOD;
        res = (res*res)%MOD;
        return (n%2==0)? res:4*res%MOD;
        
    }
}