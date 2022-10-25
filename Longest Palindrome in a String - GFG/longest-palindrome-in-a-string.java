//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        int start=0,end=0,len=1,lo,hi,max=0;
        
        for(int i=0;i<S.length()-1;i++){
            lo=i-1;
            hi=i+1;
            len=1;
            while(lo>=0 && hi<S.length() && S.charAt(hi)==S.charAt(lo)){
                len+=2;
                lo--;
                hi++;
            }
            if(max<len){
                start=lo+1;
                end=hi-1;
                max=len;
            }
            len=0;
            hi=i+1;
            lo=i;
            while(lo>=0 && hi<S.length() && S.charAt(hi)==S.charAt(lo)){
                len+=2;
                lo--;
                hi++;
            }
            if(max<len){
                start=lo+1;
                end=hi-1;
                max=len;
            }
        }
        //System.out.println(start+"  "+end);
        return S.substring(start,end+1);
        
    }
}