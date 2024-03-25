class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] check = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(check[nums[i]]==1) res.add(nums[i]);
            check[nums[i]]++;
        }
        return res;
    }
}