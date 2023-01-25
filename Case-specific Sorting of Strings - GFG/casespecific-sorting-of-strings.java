//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        int[] check = new int[str.length()];
        int count=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>95) check[i]=2;
            else {
                check[i]=1;
                count++;
            }
        }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int k=0;
        int j=count;
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(check[i]==2){
                ans.append(arr[j++]);
            }
            else{
                ans.append(arr[k++]);
            }
        }
        //System.out.println(ans);
        
        return ans.toString();
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends