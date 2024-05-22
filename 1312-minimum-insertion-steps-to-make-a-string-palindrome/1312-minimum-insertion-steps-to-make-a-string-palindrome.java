class Solution {
    public int minInsertions(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        int n=s.length();
        int m=reversed.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return s.length()-lcs(s,reversed,n-1,m-1,dp);
    }
    
    public int lcs(String s1,String s2,int n,int m,int[][] dp){
        if(n<0 || m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m)) return dp[n][m]=1+lcs(s1,s2,n-1,m-1,dp);
        else return dp[n][m]=Math.max(lcs(s1,s2,n,m-1,dp),lcs(s1,s2,n-1,m,dp));
    }
}