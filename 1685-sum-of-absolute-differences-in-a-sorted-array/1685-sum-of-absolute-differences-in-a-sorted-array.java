class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int prev=0,next=0,n=nums.length,ans[]=new int[n];
        for(int i=0;i<n;i++)
            next+=nums[i];
        for(int i=0;i<n;i++) {
            next-=nums[i];
            ans[i]=i*nums[i]-prev+next-(n-i-1)*nums[i];
            prev+=nums[i];
        }
        return ans;
    }
}
