class Solution {
    public int maxProductDifference(int[] nums) {
        int maxpro=0,minpro=nums[0]*nums[1];
            for(int i=0;i<nums.length;i++){
                    for(int j=0;j<nums.length;j++){
                            if(i!=j){
                                    maxpro=Math.max(maxpro,nums[i]*nums[j]);
                            }
                    }
            }
            for(int i=0;i<nums.length;i++){
                    for(int j=0;j<nums.length;j++){
                            if(i!=j){
                                    if(nums[i]*nums[j]<minpro)
                                            minpro=nums[i]*nums[j];
                            }
                    }
            }
            return maxpro-minpro;
    }
}