class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        //Tabulation Method for LCS :-
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        int i=n,j=m;
        while(j>0 && i>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)) {
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                ans.append(s1.charAt(i-1));
                i--;
            }
            else {
                ans.append(s2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            ans.append(s1.charAt(i-1));
            i--;
         }
         while(j>0){
            ans.append(s2.charAt(j-1));
            j--;
        }
        
        return ans.reverse().toString();
    }
}