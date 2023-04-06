class Solution {
    public int closedIsland(int[][] grid) {
        int ans =0 ;
        for(int i=0; i <grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        ans++;
                    }
                }
            }
        }
        
        return ans;
    }
    
    boolean dfs(int[][] grid , int row,int col){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1){
                return false;
            }
        if(grid[row][col]==1) return true;
        grid[row][col]=1;
        
        boolean p =dfs(grid,row+1,col);
        boolean q =dfs(grid,row,col+1);
        boolean r =dfs(grid,row-1,col);
        boolean s =dfs(grid,row,col-1);
        
        return  p && q &&  r && s;
    }
}