class Solution {
    public int maxCoins(int[] nums) {
        int n =nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i :nums){
            al.add(i);
        }
        al.add(1);
        al.add(0, 1);
        int[][] dp = new int[al.size()][al.size()];
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i > j) continue;
                int maxi = Integer.MIN_VALUE;
                
                // Iterate through possible indices to split the array
                for (int ind = i; ind <= j; ind++) {
                    int cost = al.get(i - 1) * al.get(ind) * al.get(j + 1) +
                               dp[i][ind - 1] + dp[ind + 1][j];
                    maxi = Math.max(maxi, cost);
                }
                dp[i][j] = maxi;
            }
        }
        return dp[1][n];
    }
    
    public int solve(ArrayList<Integer> nums,int i,int j,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int ans=nums.get(k)*nums.get(i-1)*nums.get(j+1);
            ans+=solve(nums,i,k-1,dp)+solve(nums,k+1,j,dp);
            max=Math.max(max,ans);
        }
        return dp[i][j]=max; 
    }
}