class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        Arrays.fill(dp,-1);
        dp[prices.length-1]=0;
        help(prices,dp,0,0);
        for(int i =0 ;i<prices.length;i++){
                    System.out.println(dp[i]);
        }
        return dp[0];
    }
    int help(int[] arr , int[] dp , int index,int last) {
            if(index>=arr.length) return 0;
            if(dp[index]!=-1) return dp[index];
            int max=0;
            for(int i =last ;i<arr.length;i++){
                    if(arr[i]-arr[index]>0){
                            max=Math.max(max,arr[i]-arr[index]+help(arr,dp,i+2,i+2));
                    }
                    else{
                            max=Math.max(max,help(arr,dp,i+1,i+1));
                    }
            }
             return dp[index]=max;
            
    }
}