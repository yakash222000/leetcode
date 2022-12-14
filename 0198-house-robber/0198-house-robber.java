class Solution {
    public int rob(int[] nums) {       
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int sum1=help(nums,0,dp);
        int sum2=help(nums,1,dp);
        return Math.max(sum1,sum2);
    }
    int help(int[] nums ,int ind,int[] dp){
            if(ind<nums.length && dp[ind]!=-1) return dp[ind];
            if(ind>nums.length-1) {
                    return 0;
            }
            int s1=nums[ind]+help(nums,ind+2,dp);
            int s2=nums[ind]+help(nums,ind+3,dp);
            dp[ind]=Math.max(s1,s2);
            return Math.max(s1,s2);
            
    }
    
}