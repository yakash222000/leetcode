class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int[] right = new int[n];
        int[] left = new int[n];
        for(int i=1;i<n;i++){
                right[i]=(i)*(Math.abs(nums[i-1]-nums[i]))+right[i-1];
                left[n-i-1] =(i)*(Math.abs(nums[n-i-1]-nums[n-i]))+left[n-i];   
        }
        for(int i=0;i<n;i++){
                ans[i]=left[i]+right[i];
        }
            return ans;
    }
}