class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        
        return solve(prices,0,0,fee,dp);
    }
    
    public int solve(int[] arr,int ind,int buy,int fee,int[][] dp){
        if(ind==arr.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int take=0;
        int not_take=0;
        if(buy==0){
            take=-arr[ind]+solve(arr,ind+1,1,fee,dp);
            not_take=solve(arr,ind+1,buy,fee,dp);
        }
        else{
            take=arr[ind]+solve(arr,ind+1,0,fee,dp)-fee;
            not_take=solve(arr,ind+1,buy,fee,dp);
        }
        return dp[ind][buy]=Math.max(take,not_take);
    }
}