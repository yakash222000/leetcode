class Solution {
    public int findMaxFish(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                if(grid[i][j]>0) max = Math.max(max,dfs(grid,i,j));
                grid[i][j] = 0;
            }
        }
        return max;
    }


    public int dfs(int[][] grid,int i,int j) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return 0;
        int curr = grid[i][j];
        grid[i][j] = 0;
        return curr + dfs(grid,i-1,j) + dfs(grid,i+1,j) + dfs(grid,i,j-1) + dfs(grid,i,j+1);
        
    }
}