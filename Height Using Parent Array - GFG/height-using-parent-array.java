//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findHeight(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findHeight(int N, int arr[]){
        int ans =1;
        for(int i=N-1;i>=0;i--){
            int j=i;
            int count=1;
            //if(i<ans) break;
            while(j>=0 && arr[j]!=-1){
                j=arr[j];
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}