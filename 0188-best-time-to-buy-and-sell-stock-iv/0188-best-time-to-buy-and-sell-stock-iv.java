class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp = new int[n][2][k+1];   //for index, buying/selling and count of transactions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return find(prices,0,0,k,dp); 
    }
    
    public int find(int[] arr,int index,int buy,int count,int[][][] dp){
        if(index==arr.length || count==0) return 0;
        if(dp[index][buy][count]!=-1) return dp[index][buy][count];
        int take=0;
        int not_take=0;
        if(buy==0){
            take=-arr[index]+find(arr,index+1,1,count,dp);            //Buying Stock
            not_take=find(arr,index+1,buy,count,dp);                  //No Transactions
        }
        else{
            take=arr[index]+find(arr,index+1,0,count-1,dp);           // Selling Stock
            not_take=find(arr,index+1,buy,count,dp);                  //No Transactions
        }
        
        return dp[index][buy][count]=Math.max(take,not_take);
        
    }
}