class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        long total=0,sum=0;
        int max=0;
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            temp[i]=max;
        }
        for(int i=0;i<nums.length;i++){
            sum=0;
            sum=nums[i]+temp[i]+total;
            //System.out.println(nums[i]+"  "+temp[i]+"  "+total);
            ans[i]=sum;
            total=ans[i];      
        }
        
        return ans;
    }
}