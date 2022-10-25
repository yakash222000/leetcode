class Solution {
    public int search(int[] nums, int target) {
        int hi=nums.length-1,low=0,mid;
        while(hi>=low) {
                mid=(hi+low)/2;
                if(nums[mid]==target) return mid;
                if(nums[mid]>target) {
                        if(nums[low]>target && nums[hi]<nums[mid] ){
                                low=mid+1;
                        }
                        else{
                                hi=mid-1;
                        }
                }
                if(nums[mid]<target){
                        if(nums[hi]<target && nums[mid]<nums[hi]){
                                hi=mid-1;
                        }
                        else
                                low=mid+1;
                }
        }
            return -1;
    }
}