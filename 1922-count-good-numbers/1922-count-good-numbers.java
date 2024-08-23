class Solution {
    int MOD = 1000000007;
    
    public long pow(long x, long y) {
        if(y==0) return 1;
        long temp = pow(x,y/2);
        temp*=temp;
        if(y%2!=0) temp *= x;
        temp%=MOD;
        return temp;
    }
    
    public int countGoodNumbers(long n) {
        return (int)(pow(4,n/2)%MOD * pow(5,n/2+n%2)%MOD);
    }
    
}