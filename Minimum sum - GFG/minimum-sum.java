// { Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            String ans = new Solution().solve(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends
class Solution {
    String solve(int[] arr, int n) {
        if(n==1) return Integer. toString(arr[0]);
        if(n==2) return Integer. toString(arr[0]+arr[1]);
        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        int carry=0,i=n-1,j=n-2,val=0;
        while(i>=0 && j>=0){
            if(arr[i]+arr[j]+carry>9){
                val=(arr[i]+arr[j]+carry)%10;
                carry=1;
            }
            else{
                val=arr[i]+arr[j]+carry;
                carry=0;
            }
            //System.out.println(val+" "+carry);
            res.insert(0,Integer. toString(val));
            i-=2;
            j-=2;
        }
        while(j>=0){
            if(arr[j]+carry>9){
                val=(arr[j]+carry)%10;
                carry=1;
            }
            else{
                val=arr[j]+carry;
                carry=0;
                
            }
            System.out.println(val+" "+carry);
            res.insert(0,Integer. toString(val));
            j-=1;
        }
        
        while(i>=0){
            if(arr[i]+carry>9){
                val=(arr[i]+carry)%10;
                carry=1;
            }
            else{
                val=arr[i]+carry;
                carry=0;
                
            }
            
            //System.out.println(val+" "+carry);
            res.insert(0,Integer. toString(val));
            i-=1;
        }
        if(carry == 1){
            int curr=(int)res.charAt(0);
            curr++;
            res.replace(0,1,Integer. toString(val));
        }
        //System.out.println(res);
        int k=0;
        for(k=0;k<res.length();k++){
            if(res.charAt(k)!='0') break;
        }
        return res.substring(k).toString();
    }
}