class Solution {
    public int maxProduct(int[] nums) {
            int m=0,temp=0,k=0;
        for(int i=0;i<nums.length;i++){
                if(m<nums[i]){
                        m=nums[i];
                        temp=i;
                }
        }
            for (int j=0;j<nums.length;j++){
                    if(j!=temp){
                        k=Math.max(k,(m-1)*(nums[j]-1));    
                    }
            }
            return k;
    }
}