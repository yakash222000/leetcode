class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] check = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            check[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(check[i]==2) res.add(i);
        }
        return res;
    }
}