class Solution {
    public boolean canJump(int[] nums) {
            int max=0,curr=0;
            if(nums.length==1) return true;
        for(int i=0;i<nums.length;i++) {
              max=Math.max(max,nums[i]+i);
              if(max>=nums.length-1) return true;
              if(max==i && nums[i]==0) return false;
        }
            return false;
    }
}