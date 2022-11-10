class Solution {
    public int singleNonDuplicate(int[] nums) {
        int hi=nums.length-1,lo=0;
        while(hi>=lo){
                int mid=(lo+hi)/2;
                if(mid==0 || mid==nums.length-1) return nums[mid];
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                        return nums[mid];
                if(mid%2==1){
                        if(nums[mid]==nums[mid+1]) hi=mid-1;
                        else lo=mid+1;
                }
                else{
                        if(nums[mid]==nums[mid+1]) lo=mid+1;
                        else hi=mid-1;
                        
                }
        }
        return 0;
    }
}