class Solution {
    double ans=1;
    public double myPow(double x, int n) {
        ans=calc(x,Math.abs(n));
        return (n>=0)? ans: 1/ans;
    }

    public double calc(double x, int n){
        if(x==1) return x;
        if(n==1) return x;
        if(n==0) return 1;


        double res = calc(x,n/2);
        return (n%2==0)? res*res : x*res*res;
    }
    
}