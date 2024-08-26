class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for(int j=0;j<k;j++){
            int index = 0,val=Integer.MAX_VALUE;
            for(int i=n-1;i>=0;i--) {
                if(nums[i]<=val){
                    val=nums[i];
                    index=i;
                }
            }
            nums[index]*=multiplier;
        }
        return nums;
    }
}