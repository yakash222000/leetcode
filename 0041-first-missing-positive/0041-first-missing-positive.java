class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long index=0;
        for(int i : nums){
            set.add(i);
            index=Math.max(index,i);
        }
                
        for(int i=1;i<=index+1;i++){
                if(!set.contains(i))
                        return i;
        }
        return nums.length;
    }
}