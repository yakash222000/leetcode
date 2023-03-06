class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        long neg=0;
        for(int i : nums){
            if(!set.contains(i) && i<=k){
                neg+=i;
                k++;
            }
            set.add(i);
        }
        long ans = (long)(1+k)*k/2-neg;   
        return ans;
    }
}