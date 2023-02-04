//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        int[] dp = new int[n];
        dp[0]=arr[0];
        if(n==1) return dp[n-1];
        dp[1]=Math.max(arr[0],arr[1]);
        if(n==2) return dp[n-1];
        dp[2]=Math.max(dp[1],dp[0]+arr[2]);
        for(int i=3;i<n;i++){
            dp[i]=arr[i]+Math.max(dp[i-2],dp[i-3]);
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}