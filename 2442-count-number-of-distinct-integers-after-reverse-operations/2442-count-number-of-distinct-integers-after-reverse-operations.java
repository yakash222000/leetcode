class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
                int num=nums[i];
                if(!set.contains(num))set.add(num);
                int n=0;
                while(num>0){
                        n*=10;
                        n+=num%10;
                        num/=10;
                }
                if(!set.contains(n))set.add(n);
        }
        return set.size();
    }
}