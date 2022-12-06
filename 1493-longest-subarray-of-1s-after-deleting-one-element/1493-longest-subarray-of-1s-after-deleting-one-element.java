class Solution {
    public int longestSubarray(int[] nums) {
        int left = -1;
        int right = 0;
        int result = 0;
        int left_len = 0;
        while(right < nums.length) {
            if(nums[right] == 0) {
                left_len = right - left-1;
                left = right;
            } else {
                result = Math.max(result,left_len + right - left);
            }
            right++;
        }
        return result  == nums.length ?  nums.length -1 : result;
    }
}