class Solution {
    public int removeDuplicates(int[] nums) {
        int temp=nums[0];
            int k=1,count=1;
            for(int i=1;i<nums.length;i++){
                    if(nums[i]!=temp){
                            temp=nums[i];
                            nums[k++]=nums[i];
                            count++;
                    }
            }
            return count;
    }
}