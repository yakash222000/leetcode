class Solution {
    public boolean check(int[] nums) {
        int temp=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                temp--;
            }
            if(temp<0) return false;
        }
        if(temp==0){
            if(nums[0]<nums[nums.length-1]) return false;
        }
        return true;
    }
}