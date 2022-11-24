class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] check = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++) {
                        if(help(board,word,0,i,j,check)) return true;
                        //check[i][j]=false;
                }
        }
        return false;
    }
    boolean help(char[][] grid,String s,int ind,int i,int j,boolean[][] check){
            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||
               check[i][j]==true || grid[i][j]!=s.charAt(ind)) 
                    return false;
            if(ind==s.length()-1) return true;
            check[i][j]=true;
            if (help(grid,s,ind+1,i+1,j,check) ||
            help(grid,s,ind+1,i,j+1,check)||
            help(grid,s,ind+1,i-1,j,check) ||
            help(grid,s,ind+1,i,j-1,check)) return true;
            check[i][j]=false;
            return false;
    }    
}