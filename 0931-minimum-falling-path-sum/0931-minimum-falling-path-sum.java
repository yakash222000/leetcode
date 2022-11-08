class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)dp[0][i]=matrix[0][i];
        for(int i=1;i<n;i++) {
                for(int j=0;j<n;j++) {
                        int min=Integer.MAX_VALUE;
                        if(j>0){
                                min=Math.min(min,dp[i-1][j-1]);
                        }
                        if(j<n-1){
                                min=Math.min(min,dp[i-1][j+1]);
                        }
                        min=Math.min(min,dp[i-1][j]);
                        dp[i][j]=matrix[i][j]+min;
                }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                res=Math.min(res,dp[n-1][i]);
        }
            return res;
    }
}