//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]matrix, int R, int C){
        return traverse(matrix,R,C,0,0,0,0,1);
    }
    
    static int[] traverse(int[][] matrix,int R,int C,int lastrow,int lastcol,int currrow,int currcol,int dir){
        if(currrow>=R || currcol>=C || currrow<0 || currcol<0){
            return new int[]{lastrow,lastcol};
        }
        if(matrix[currrow][currcol]==0){
            if(dir==1){
                return traverse(matrix,R,C,currrow,currcol,currrow,currcol+1,1);
            }
            if(dir==2){
                return traverse(matrix,R,C,currrow,currcol,currrow+1,currcol,2);
            }
            if(dir==3){
                return traverse(matrix,R,C,currrow,currcol,currrow,currcol-1,3);
            }
            if(dir==4){
                return traverse(matrix,R,C,currrow,currcol,currrow-1,currcol,4);
            }
        }
        if(matrix[currrow][currcol]==1){
            matrix[currrow][currcol]=0;
            if(dir==1){
                return traverse(matrix,R,C,currrow,currcol,currrow+1,currcol,2);
            }
            if(dir==2){
                return traverse(matrix,R,C,currrow,currcol,currrow,currcol-1,3);
            }
            if(dir==3){
                return traverse(matrix,R,C,currrow,currcol,currrow-1,currcol,4);
            }
            if(dir==4){
                return traverse(matrix,R,C,currrow,currcol,currrow,currcol+1,1);
            }
        }
        return new int[]{0,0};
    }
}