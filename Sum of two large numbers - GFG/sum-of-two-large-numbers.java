//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        StringBuilder res= new StringBuilder();
        int i=X.length()-1,j=Y.length()-1,carry=0;
        while(i>=0 && j>=0){
            int val=Character.getNumericValue(X.charAt(i))+
            Character.getNumericValue(Y.charAt(j))+carry;
            if(val>9) {
                carry=1;
                val=val%10;
            }
            else{
                carry=0;
            }
            res.insert(0,Integer.toString(val));
            i--;
            j--;
        }
        
        while(i>=0 ){
            int val=Character.getNumericValue(X.charAt(i))+carry;
            if(val>9) {
                carry=1;
                val=val%10;
            }
            else{
                carry=0;
            }
            res.insert(0,Integer.toString(val));
            i--;
        }
        
        while(j>=0 ){
            int val=Character.getNumericValue(Y.charAt(j))+carry;
            if(val>9) {
                carry=1;
                val=val%10;
            }
            else{
                carry=0;
            }
            res.insert(0,Integer.toString(val));
            j--;
        }
        
        if(carry==1) {
                res.insert(0,'1');
        }
        
        int k=0;
        while(k<res.length()-1 && res.charAt(k)=='0') k++;
        return res.substring(k).toString();
    }
}