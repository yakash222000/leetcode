class Solution {
    public int longestSquareStreak(int[] nums) {
        
        Arrays.sort(nums);
        HashSet<Long> set = new HashSet<>();

        int max = 1;
        for(int i : nums) set.add((long)i);

        for(int i : nums) {
            int count = 1; 
            long temp = i;
            while(set.contains(temp*temp)){
                count++;
                temp *= temp;
                set.remove(temp);
            }
            max = Math.max(max, count);
        }

        return max==1?-1:max;


    }
}