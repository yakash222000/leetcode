class Solution {
    public int splitArray(int[] nums, int k) {
        int low=nums[0],high=0;
        for(int i : nums){
            high+=i;
            low=Math.max(low,i);
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(check(nums,mid,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public boolean check(int[] nums,int mid,int k){
        int count=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]>mid){
                count++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(count<=k) return true;
        return false;
    }
}