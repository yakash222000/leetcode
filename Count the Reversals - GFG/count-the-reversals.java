//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if(s.length()%2==1) return -1;
        Stack<Character> st = new Stack<>();
        int res=0;
        for(char c : s.toCharArray()){
            if(st.isEmpty()){
                if(c=='}') res++;
                st.push('{');
            }
            else{
                if(c=='}' && st.peek()=='{') {
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        res+=st.size()/2;
        return res;
    }
}