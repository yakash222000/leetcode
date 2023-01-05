//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        int[][] visited = new int[n][n];
        ArrayList<String> res = new ArrayList<>();
        String ans =""; 
        //System.out.println(n);
        help(0,0,m,visited,n-1,ans,res);
        return res;
    }
    static void help(int i,int j,int[][] arr,int[][] visit,int n,String ans,ArrayList<String> res){
        if(i<0 || j<0 || i>n || j>n || arr[i][j]==0 || visit[i][j]==1) return;
        if(i==n && j==n){
            res.add(ans);
            return;
        }
        visit[i][j]=1;
        help(i+1,j,arr,visit,n,ans+"D",res);
        help(i-1,j,arr,visit,n,ans+"U",res);
        help(i,j+1,arr,visit,n,ans+"R",res);
        help(i,j-1,arr,visit,n,ans+"L",res);
        visit[i][j]=0;
        
    }
}