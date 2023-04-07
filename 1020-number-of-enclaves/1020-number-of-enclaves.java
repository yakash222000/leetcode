class Solution {
    public int numEnclaves(int[][] grid) {
        int ans =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1){
                    if(grid[i][j]==1)dfs(grid,i,j);
                }
            }
        }
        
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         System.out.print(grid[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]==1) ans++;
            }
        }    
        return ans;
    }
    
    void dfs(int[][] grid , int i , int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0) return ;
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}