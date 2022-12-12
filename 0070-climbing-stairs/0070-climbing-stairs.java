class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return rescount(n,dp);
    }
    public int rescount(int n,int[] dp){
            if(n<=2)
                    return n;
            if(dp[n]!=-1)
                    return dp[n];
            return dp[n]=rescount(n-1,dp)+rescount(n-2,dp);      
    }
}