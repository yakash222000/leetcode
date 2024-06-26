class Solution {
    public int numIslands(char[][] grid) {
            int count=0;
        for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                        if(grid[i][j]=='1'){
                                help(grid,i,j);
                                count++;
                        }
                }
        }
            return count;
    }
    public static void help(char[][] grid,int i,int j){
            if(i>=grid.length || j>=grid[0].length || i<0 || j<0) return;
            if(grid[i][j]=='0') return ;
            else grid[i][j]='0';
            help(grid,i+1,j);
            help(grid,i,j+1);
            help(grid,i-1,j);
            help(grid,i,j-1);
    }
}