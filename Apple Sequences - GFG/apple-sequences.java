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
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        int max=0;
        int last=-1,i=0,count=0,j=0;
        while(i<n){
            if(count==m && arr.charAt(i)=='O'){
                while(j<n){
                    if(arr.charAt(j)=='O'){
                        break;
                    }
                    j++;
                }
                j++;
                count--;
            }
            if(arr.charAt(i)=='O'){
                count++;
            }
            max=Math.max(max,i-j+1);
            i++;
            
        }
        return max;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends