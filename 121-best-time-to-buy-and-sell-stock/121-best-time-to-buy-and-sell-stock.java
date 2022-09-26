class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int[] sell = new int[n];
        int max=prices[n-1];
        sell[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--) {
              max=Math.max(sell[i+1],prices[i]);
              sell[i]=max;
        }
        int min=prices[0];
        int res=0;
        for(int i=1;i<n;i++){
                res=Math.max(res,sell[i]-min);
                min=Math.min(min,prices[i]);
                
        }
         return res;
    }
}