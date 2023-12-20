class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length;
        int sum = prices[1]+prices[0];
        //System.out.println(sum);
        if(money>=sum) return money-sum;
        else return money;
    }
}