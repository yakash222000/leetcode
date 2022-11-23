class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
                if(checkRow(board,i)==false) return false;
        }
        
        for(int i=0;i<9;i++){
                if(checkCol(board,i)==false) return false;
        }
        for(int i=0;i<9;i+=3){
                for(int j=0;j<9;j+=3){
                        if(checkBox(board,i,j)==false) return false;
                }
        }
        return true;
    }
    boolean checkRow(char[][] grid,int index){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                    //System.out.print("H");
                    if(set.contains(grid[index][i]) && grid[index][i]!='.') return false;
                    set.add(grid[index][i]);
            }
            return true;
    }
    
    boolean checkCol(char[][] grid,int index){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                    if(set.contains(grid[i][index]) && grid[i][index]!='.') return false;
                    set.add(grid[i][index]);
            }
            return true;
    }
    boolean checkBox(char[][] grid,int a,int b){
            HashSet<Character> set = new HashSet<>();
            for(int i=a;i<a+3;i++){
                    for(int j=b;j<b+3;j++){
                            if(set.contains(grid[i][j]) && grid[i][j]!='.') return false;
                            set.add(grid[i][j]);
                    }
            }
            return true;
    }
}