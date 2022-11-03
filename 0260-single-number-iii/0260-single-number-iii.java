class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i])){
                        set.remove(nums[i]);
                }
                else{
                        set.add(nums[i]);
                }
        }
            int k=0;
        for(int i : set){
                ans[k++]=i;
        }
            return ans;
        
        
    }
}