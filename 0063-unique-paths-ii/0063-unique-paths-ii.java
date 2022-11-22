class Solution {
    int count=0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[101][101];           
        return help(obstacleGrid,0,0,dp);
    }
    int help(int[][] grid,int x,int y,int[][] dp){
            if(dp[y][x]!=0) return dp[y][x];
            if(grid[0].length<=x || y>=grid.length || grid[y][x]==1) return 0 ;
            if(x==grid[0].length-1 && y==grid.length-1) {
                    return 1;
            }
            dp[y][x]=help(grid,x+1,y,dp)+help(grid,x,y+1,dp);
            return dp[y][x];
    }
}