class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(prices,0,0,dp);
    }
    
    public int solve(int[] arr,int index,int buy,int[][] dp){
        if(index==arr.length) return 0;
        if(dp[index][buy]!=-1) return dp[index][buy];
        int take =0,not_take=0;
        if(buy==0){
            not_take=solve(arr,index+1,buy,dp);
            take=-arr[index]+solve(arr,index+1,1,dp);
        }
        else{
            not_take=solve(arr,index+1,buy,dp);
            take=arr[index]+solve(arr,index+1,0,dp);
        }
        return dp[index][buy]=Math.max(take,not_take);
    }
}