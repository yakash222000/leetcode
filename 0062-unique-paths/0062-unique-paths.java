class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return solve(m-1,n-1,dp);
    }
    
    public int solve(int m ,int n,int[][] dp){
        if(m==0 || n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n]=solve(m-1,n,dp)+solve(m,n-1,dp);
    }
}