class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if((0>=i || nums[i]>nums[i-1]) && (i>=nums.length-1 || nums[i]>nums[i+1]))
            return i;
        }
        return -1;
    }
}