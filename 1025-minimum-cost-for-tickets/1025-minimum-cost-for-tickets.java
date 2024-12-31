class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maxDays = days[days.length-1];
        boolean[] valid = new boolean[maxDays+1];
        int[] dp = new int[maxDays+1];
        dp[0]=0;
        for(int i : days) valid[i] = true;

        for(int i = 1; i<=maxDays; i++) {
            if(!valid[i]) {
                dp[i] = dp[i-1];
                continue;
            }
            
            dp[i] = dp[i-1] + costs[0];
            dp[i] = Math.min(dp[Math.max(0,i-7)] + costs[1],dp[i]);
            dp[i] = Math.min(dp[Math.max(0,i-30)] + costs[2],dp[i]);

        }

        return dp[maxDays];
    }
}