class Solution {
    int ans=0;
    public int uniquePathsIII(int[][] grid) {
        int[][] visited = new int[grid.length][grid[0].length];
        int startRow=0,startCol=0,empty=0;
        for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                        if(grid[i][j]==1){
                                startRow=i;
                                startCol=j;
                        }
                        if(grid[i][j]==0) empty++;
                }
        }
        help(visited,grid,startRow,startCol,empty,0);
        return ans;    
    }
    void help(int[][] visited,int[][] grid,int row,int col,int Empty,int count){
            if(row<0 || row>=grid.length || col<0 ||
        col>=grid[0].length ||  visited[row][col]==1 || grid[row][col]==-1)
                return;
        if(grid[row][col]==2 && count==Empty+1){         
                ans++;
                System.out.println(ans);
                return;
        }
        visited[row][col]=1;
        help(visited,grid,row,col+1,Empty,count+1);
        help(visited,grid,row,col-1,Empty,count+1);
        help(visited,grid,row+1,col,Empty,count+1);
        help(visited,grid,row-1,col,Empty,count+1);
        visited[row][col]=0;
            
    }        
}