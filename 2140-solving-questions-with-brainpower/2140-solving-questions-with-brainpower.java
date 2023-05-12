class Solution {
    public long mostPoints(int[][] questions) {
        long ans =0;
        long[] dp = new long[questions.length];
        dp[questions.length-1]=(long)questions[questions.length-1][0];
        for(int i=questions.length-2;i>=0;i--){
            if(questions[i][1]+i>=questions.length-1){
                dp[i]=(long)questions[i][0];
            }
            else{
                dp[i]=(long)questions[i][0];
                dp[i]+=dp[questions[i][1]+1+i];   
            }
            dp[i]=Math.max(dp[i],dp[i+1]);
        }
        return dp[0];
    }
}