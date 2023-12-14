class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rowone = new int[grid.length];
        int[] colone = new int[grid[0].length];
        for(int i=0;i<grid.length;i++) {
                int count=0;
                for(int j=0;j<grid[0].length;j++) {
                        if(grid[i][j]==1) count++;
                }
                rowone[i]=count;
        }
        for(int i=0;i<grid[0].length;i++) {
                int count=0;
                for(int j=0;j<grid.length;j++) {
                        if(grid[j][i]==1) count++;
                }
                colone[i]=count;
        }
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
                for(int j=0;j<grid[0].length;j++) {
                        ans[i][j] = -grid.length-grid[0].length+rowone[i]+colone[j]+rowone[i]+colone[j];
                }
        }
            return ans;
    }
}