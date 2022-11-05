class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0,count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i : nums) {
                count=0;
                if(!set.contains(i-1)){
                        int temp=i;
                        while(set.contains(temp)){
                                temp++;
                                count++;
                        }
                        res=Math.max(count,res);
                }
        }
            return res;
    }
}