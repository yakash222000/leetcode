//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        // if(N==1){
        //     return Matrix[0][0];
        // }
        int[][] arr = new int[Matrix.length][Matrix[0].length];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=Matrix[i][j];
            }
        }
        for(int i=N-2;i>=0;i--){
            for(int j=0;j<N;j++){
                int max=arr[i+1][j];
                if(j>0) max = Math.max(max,arr[i+1][j-1]);
                if(j<N-1) max = Math.max(max,arr[i+1][j+1]);
                arr[i][j]+=max;
            }
        }

        int res=0;
        for(int i=0;i<N;i++) res=Math.max(res,arr[0][i]);
        return res;
    }
}