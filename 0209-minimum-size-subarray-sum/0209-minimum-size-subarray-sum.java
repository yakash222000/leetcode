class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i=0,j=0,sum=0;
        while(i<nums.length) {
                if(j==nums.length && sum<target) break;
                if(sum>=target){
                        min=Math.min(min,j-i);
                }
                if(sum>=target){
                        sum-=nums[i++];
                        continue;
                }
                if(sum<target ){
                        sum+=nums[j++];
                }
        }
            if(min==Integer.MAX_VALUE) return 0;
            
            return min;
    }
}