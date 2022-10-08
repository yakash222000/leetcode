class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        int pro=1;
        for(int i=0;i<nums.length;i++){
                pro=1;
                for(int j=i;j<nums.length;j++){
                     pro*=nums[j];
                     res=Math.max(res,pro);
                }
        }
            return res;
    }
}