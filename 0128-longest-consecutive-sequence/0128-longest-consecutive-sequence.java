class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> data = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            data.add(nums[i]);
        }
        int max = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (data.contains(nums[i])) {
                int count = 1;
                int tmp = nums[i] - 1;
                while (data.contains(tmp)){
                    data.remove(tmp);
                    tmp --;
                    count ++;
                }
                tmp = nums[i] + 1;
                while (data.contains(tmp)) {
                    data.remove(tmp);
                    tmp ++;
                    count ++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}