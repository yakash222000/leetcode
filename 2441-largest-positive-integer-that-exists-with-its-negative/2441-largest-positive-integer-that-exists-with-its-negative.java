class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start=0,end=nums.length-1;
         while(start<end){
                 if(nums[start]*-1==nums[end]){
                         return nums[end];
                 }
                 if(nums[start]*-1>nums[end]){
                         start++;
                 }
                 else end--;
         }
         return -1;
    }
}