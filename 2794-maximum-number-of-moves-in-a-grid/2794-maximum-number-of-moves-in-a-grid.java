class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        int max = 0,last=0;
        for(int i=1;i<m;i++) {
            for(int j=0;j<n;j++) {
                // Lower left cell check
                if(j!=n-1 && grid[j][i]>grid[j+1][i-1]){
                    dp[j][i] = Math.max(dp[j][i],dp[j+1][i-1]+1);
                }
                // Left cell check
                if(grid[j][i]>grid[j][i-1]) {
                    dp[j][i] = Math.max(dp[j][i],dp[j][i-1]+1);
                }
                // Upper left cell check
                if(j!=0 && grid[j][i]>grid[j-1][i-1]){
                    dp[j][i] = Math.max(dp[j][i],dp[j-1][i-1]+1);
                }   
                max = Math.max(max, dp[j][i]);
            }
            // If moves are not incremented from the last column return 
            if(max == last) return max;
            last = max;
        }
        return max;
    }
}