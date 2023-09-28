class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int k=0;
        for(int i : nums){
            if(i%2==0){
                res[k++]=i;
            }
        }
        for(int i : nums){
            if(i%2!=0){
                res[k++]=i;
            }
        }
        return res;
    }
}