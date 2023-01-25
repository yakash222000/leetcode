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
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		ArrayList <ArrayList <Integer>> res = new Solution().binTreeSortedLevels (arr, n);
    		
    		for (int i = 0; i < res.size(); i++)
    		{
    		    for (int j = 0; j < (res.get (i).size()); j++)
    		    {
    		        System.out.print (res.get(i).get(j) + " ");
    		    }
    		    System.out.println ();
    		}
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList <ArrayList <Integer>> binTreeSortedLevels (int arr[], int n)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int m= q.size();
            ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i=0;i<m;i++){
                int temp = q.poll();
                if(2*temp+1<n) q.add(2*temp+1);
                if(2*temp+2<n) q.add(2*temp+2);
                arr1.add(arr[temp]);
            }
            Collections.sort(arr1);
            ans.add(arr1);
        }
        return ans;
    }
}