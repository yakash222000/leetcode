class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] prev =new int[n];
        int[] next =new int[n];
        prev[0]=nums[0];
        next[n-1]=nums[n-1];
        for(int i=1;i<n;i++)prev[i]=nums[i]*prev[i-1];
        for(int i=n-2;i>=0;i--) next[i]=nums[i]*next[i+1];
        ans[0]=next[1];
        ans[n-1]=prev[n-2];
        for(int i=1;i<n-1;i++){
                ans[i]=next[i+1]*prev[i-1];
        }
            return ans;
        
            
   }
}