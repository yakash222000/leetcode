class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int k=0,j=1,i=0;
        while(i<n){
                if(nums[i]<0){
                        res[j]=nums[i];
                        j+=2;
                }
                else{
                        res[k]=nums[i];
                        k+=2;
                }
                i++;
        }
            return res;
    }
}