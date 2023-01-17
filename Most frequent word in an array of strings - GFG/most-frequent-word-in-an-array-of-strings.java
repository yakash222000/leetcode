//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n) {
        HashMap<String , Integer> map = new HashMap<>();
        HashMap<String ,Integer> map1 = new HashMap<>();
        String ans ="";
        int max=0;
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            map.put(s,map.getOrDefault(s,0)+1);
            map1.putIfAbsent(s,i);
            if(max<=map.get(s)) {
                ans = s;
                max=map.get(s);
            }
        }
        int maxfreq=0;
        for(String s : map.keySet()){
            if(map.get(s)==max){
                if(maxfreq<map1.get(s)){
                    maxfreq=map1.get(s);
                    ans=s;
                }
            }
        }
        return ans;
    }

}


//{ Driver Code Starts.
// } Driver Code Ends