class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] pref = new int[nums.length];
        int[] post = new int[nums.length];
        pref[0]=nums[0];
        post[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++) {
                pref[i]=Math.min(pref[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--) {
                post[i]=Math.max(post[i+1],nums[i]);
        }
        for(int i=1;i<nums.length-1;i++){
                if(pref[i-1]<nums[i] && post[i+1]>nums[i]){
                        return true;
                }
        }
        return false;
        
    }
}