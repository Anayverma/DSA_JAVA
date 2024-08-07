class Solution {
    public double myPow(double x, int n) {
        int sign=0;
        if(n<0) sign=1;
        double res=1.0;
        if(n%2==0)  res=x*helper(x,Math.abs(n));
        else res=helper(x,Math.abs(n));
        return sign==1?(1/res):res;
    }
    public double helper(double x,int n){
        // if(n==0) return 1.0;
        // else if(n==1) return x;
        // else return x*helper(x,n-1);
        if(n==0) return 1.0;
        else if( n==1) return x;
        else if(n%2==0) return x*x*helper(x,n/2);
        else return x*x*helper(x,n-(n/2));


    }
}
