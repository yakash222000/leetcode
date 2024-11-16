class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int[] res = new int[nums.length-k+1];
        Arrays.fill(arr,1);
        for(int i =1; i<nums.length; i++) {
            if( nums[i] == nums[i-1]+1 ) {
                arr[i] = arr[i-1]+1;
            }
        }
        for(int i = k-1;i<nums.length; i++){
            if(arr[i]>=k) {
                res[i-k+1] = nums[i];
            }
            else{
                res[i-k+1] = -1;
            }
        }
        return res;
    }
}