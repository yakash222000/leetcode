class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
                int count=0,j=i;
                for(;j<nums.length;j++){
                        if(nums[j]==0) count++;
                        if(count==2) break;
                }
                ans=Math.max(ans,j-i-1);
        }
        return ans;
    }
}