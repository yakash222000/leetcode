class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return find(s,t,n-1,m-1,dp);
    }
    
    public int find(String s1,String s2,int i,int j,int[][] dp){
        if(i<0) return 0;
        if(i==0 && j!=0) return 0;
        if(j==0) {
            if(s1.charAt(i)==s2.charAt(j)) {
                if(i==0) return 1;
                else return 1 + find(s1,s2,i-1,j,dp);
            }
            else return find(s1,s2,i-1,j,dp);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int one = 0;
        if(s1.charAt(i)==s2.charAt(j)){
            one=find(s1,s2,i-1,j-1,dp);
        }
        int two=find(s1,s2,i-1,j,dp);
        return dp[i][j]=one+two;
    }
}