class Solution {
    public void moveZeroes(int[] nums) {
        int count=0,index=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) count++;
            else nums[index++]=nums[i];
        }
        for(int i=nums.length-1;count>0;i--) {
            nums[i]=0;
            count--;
        }
    }
}