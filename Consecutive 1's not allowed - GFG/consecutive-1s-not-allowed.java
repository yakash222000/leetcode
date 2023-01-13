//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java



class Solution {
    int MOD = 1000000007;
    long countStrings(int n) {
        long[][] dp = new long[n+1][2];
        for(long[] i : dp)Arrays.fill(i,-1);
        return help(n,0,dp)%MOD;
    }
    long help(int n , int last ,long[][] dp){
        if(dp[n][last]!=-1) return dp[n][last];
        if(n==1 && last==0) return 2;
        if(n==1 && last==1) return 1;
        long sum=help(n-1,0,dp);
        if(last==0) sum+=help(n-1,1,dp);
        return dp[n][last]=sum%MOD;
    }
}