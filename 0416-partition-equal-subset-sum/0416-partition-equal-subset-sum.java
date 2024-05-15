class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i : nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        dp = new Boolean[nums.length+1][sum/2+1];
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<sum/2+1;j++){
                dp[i][j]=null;
            }
        }
        return help(nums,nums.length-1,sum/2,dp);
    }
    
    public boolean help(int[] nums,int index,int sum,Boolean[][] dp){
        if(index<0 || sum<0) return false;
        if(sum==0) return true;
        if(dp[index][sum]!=null) return dp[index][sum];
        return dp[index][sum]=help(nums,index-1,sum-nums[index],dp)||help(nums,index-1,sum,dp);
        
    }
}