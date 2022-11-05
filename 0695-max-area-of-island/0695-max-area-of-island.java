class Solution {
    static int area=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
            for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[0].length;j++){
                            if(grid[i][j]==1) {
                                area=0;
                                help(grid,i,j);
                                max=Math.max(max,area);
                            }     
                    }
            }
            return max;
    }
    public static  void help(int[][] grid,int i,int j){
           if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
                   return ;
           grid[i][j]=0;
           area++;
           //System.out.println(area);
           help(grid,i+1,j);
           help(grid,i-1,j);
           help(grid,i,j+1);
           help(grid,i,j-1);
           return ;
   }
}