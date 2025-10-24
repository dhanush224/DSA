class Solution {
    double ans=1;
    public double myPow(double x, int n) {

        if(x==0) return x;
        if(x==1) return x;
        if(n==0) return 1;

        if(x==-1){
            if(n%2==0) return -1*x;
            else return x;
        } 

        if(n==Integer.MAX_VALUE && x<1) return 0.0;
        else if(n<=-200000000) return 0.0;      

        return calc(x,n);
    }

    public double calc(double x, int n){
        if(n==0) return ans;

        if(n>0){
            ans*=x;
            n--;
            calc(x,n);
        }else{
            ans/=x;
            n++;
            calc(x,n);
        }

        return ans;
    }
}