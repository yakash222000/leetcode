class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int res=0;
        for(int i : prices){
                res=Math.max(res,i-min);
                min=Math.min(min,i);        
        }
         return res;
    }
}