class Solution {
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
                int col=i,row=0;
                while(row<grid.length){
                        if(grid[row][col]==1){
                                if(col==grid[0].length-1 || grid[row][col+1]==-1){
                                        ans[i]=-1;
                                        break;
                                }
                                else{
                                        row++;
                                        col++;
                                }
                        }
                        else{
                                if(col==0 || grid[row][col-1]==1){
                                        ans[i]=-1;
                                        break;
                                }
                                else{
                                        row++;
                                        col--;
                                }
                                
                        }
                }
                if(row==grid.length) ans[i]=col;
        }
         return ans;   
    }
}