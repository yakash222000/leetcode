class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return help(nums,target,0,0);
    }
    
    public int help(int[] nums,int target,int sum,int index){
        if(index==nums.length-1){
            if(sum+nums[index]==target && sum-nums[index]==target) return 2;
            else if(sum+nums[index]==target) return 1;
            else if(sum-nums[index]==target) return 1;
            else return 0;
        }
        int pos=help(nums,target,sum+nums[index],index+1);
        int neg=help(nums,target,sum-nums[index],index+1);
        return pos+neg;
    }
}