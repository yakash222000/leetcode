class Solution {
    public long zeroFilledSubarray(int[] nums) {
       long res=0;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                            long count=1;
                            i++;
                            while(i<nums.length && nums[i]==0){
                                    i++;
                                    count++;
                            }
                            res+=(count*(count+1))/2;
                    }
            }
            return res;
            
    }
}