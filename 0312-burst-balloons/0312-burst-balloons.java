class Solution {
    public int maxCoins(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i :nums){
            al.add(i);
        }
        al.add(1);
        al.add(0, 1);
        int[][] dp = new int[al.size()][al.size()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(al,1,nums.length,dp);
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