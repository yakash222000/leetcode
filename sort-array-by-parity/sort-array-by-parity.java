class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l=0,r=n-1;
        for(int i : nums) {
            if(i%2==0) ans[l++]=i;
            else ans[r--]=i;
        }
        return ans;
    }
}