class Solution {
    public boolean isMonotonic(int[] nums) {
            int temp=0;
            int i=0;
        while(i<nums.length-1){
               if(nums[i]>nums[i+1]){
                    temp=0;
                    break;
               } 
                if(nums[i]<nums[i+1]){
                        temp=1;
                        break;
                }
                i++;
        }
        for(int j=0;j<nums.length-1;j++){
                if(temp==1 && nums[j]>nums[j+1])
                        return false;
                if(temp==0 && nums[j]<nums[j+1])
                        return false;
        }
            return true;
        
    }
}