//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
        int n = S.length();
        int mod = 1000000007;
        long dp[] = new long[n+1];
        dp[0] = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 1; i <= n;i++){
            dp[i] = 2*dp[i-1]%mod;
            char c = S.charAt(i-1);
            if(map.containsKey(c)){
                int j = map.get(c);
                dp[i] = (dp[i]%mod -  dp[j-1]%mod +mod)%mod;
            }
            map.put(c,i);
        }
        return (int)dp[n]%mod;
    }
}