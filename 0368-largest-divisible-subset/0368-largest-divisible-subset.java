class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans  = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] hash = new int[n];
        for(int i=1;i<n;i++){
            hash[i]=i;
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    hash[i]=j;
                }
            }
        }
        int max=-1,index=-1;
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
                index=i;
            }
        }
        ans.add(nums[index]);
        
        while(index!=hash[index]){
            index=hash[index];
            ans.add(nums[index]);
        }
        
        return ans;
    }
}