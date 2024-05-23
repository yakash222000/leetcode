class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return n+m-2*lcs(word1,word2,n-1,m-1,dp);
    }
    
    public int lcs(String s1,String s2,int n,int m,int[][] dp){
        if(n<0 || m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m)) return dp[n][m]=1+lcs(s1,s2,n-1,m-1,dp);
        else return dp[n][m]=Math.max(lcs(s1,s2,n,m-1,dp),lcs(s1,s2,n-1,m,dp));
    }
}