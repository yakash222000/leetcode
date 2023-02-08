class Solution {
    public int jump(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<arr.length;i++){
                int curr=arr[i];
                for(int j=i+1;j<arr.length && j<=i+curr;j++){
                        dp[j]=Math.min(dp[i]+1,dp[j]);
                }
        }
        return dp[arr.length-1];
    }
}