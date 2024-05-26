class Solution {
    public int minCut(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0,s.length(),dp)-1;
    }
    
    public int solve(String s,int i,int j,int[] dp){
        if(i==j) return 0;
        if(dp[i]!=-1) return dp[i];
        // return 0;
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            if(palindrome(s,i,k)){
                int min=1+solve(s,k+1,j,dp);
                ans=Math.min(ans,min);  
            }   
        }
        return dp[i]=ans;
    }
    
    public boolean palindrome(String s,int i,int j){
        while(j>i){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}