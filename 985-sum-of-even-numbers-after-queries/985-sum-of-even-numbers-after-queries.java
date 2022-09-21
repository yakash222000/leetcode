class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length,m=queries.length;
        int[] ans = new int[m];
        int evensum=0;
        for(int i :nums) {
                if(i%2==0) evensum+=i;
        }
        for(int i=0;i<m;i++){
                 int val = queries[i][0], idx = queries[i][1];
            if (nums[idx] % 2 == 0) evensum -= nums[idx];
            nums[idx] += val;
            if (nums[idx] % 2 == 0) evensum += nums[idx];
            ans[i] = evensum;
        }
            return ans;
    }
}