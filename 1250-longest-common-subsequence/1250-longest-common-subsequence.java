class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return find(text1,text2,text1.length()-1,text2.length()-1,dp);
    } 
    public int find(String s1,String s2,int n1,int n2,int[][] dp){
        if(n1==-1 || n2==-1) return 0;
        if(dp[n1][n2]!=-1) return dp[n1][n2];
        if(s1.charAt(n1)==s2.charAt(n2)) return dp[n1][n2]=1 + find(s1,s2,n1-1,n2-1,dp);
        else return dp[n1][n2]=Math.max(find(s1,s2,n1-1,n2,dp),find(s1,s2,n1,n2-1,dp));
    }
}