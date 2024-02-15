class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=nums[0]+nums[1];
        long ans=0;
        for(int i=2;i<nums.length;i++){
            if(sum>nums[i])
            ans=Math.max(ans,sum+nums[i]);
            sum+=nums[i];
        }
        if(ans==0) return -1;
        return ans;
    }
}