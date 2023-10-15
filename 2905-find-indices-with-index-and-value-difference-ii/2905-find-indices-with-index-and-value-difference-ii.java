class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans = new int[2];       
        int[][] max = new int[nums.length][4];
        int n=nums.length;
        max[n-1][0]=nums[n-1];
        max[n-1][1]=n-1;
        max[n-1][2]=nums[n-1];
        max[n-1][3]=n-1;
        int maxval = nums[n-1],minval=nums[n-1];
        int lastmax=n-1,lastmin=n-1;
        for(int i=n-2;i>=0;i--){
            if(maxval<nums[i]){
                maxval=nums[i];
                lastmax=i;
            }
            if(minval>nums[i]){
                minval=nums[i];
                lastmin=i;
            }
            max[i][0]=maxval;
            max[i][1]=lastmax;
            max[i][2]=minval;
            max[i][3]=lastmin;
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(max[i][0]+" "+max[i][1]+" "+max[i][2]+" "+max[i][3]);
        // }
        
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length-indexDifference;i++){
            if(Math.abs(nums[i]-max[i+indexDifference][0])>=valueDifference){
                System.out.println(Math.abs(nums[i]-max[i+indexDifference][0]));
                    ans[0]=i;
                    ans[1]=max[i+indexDifference][1];
                    return ans;
            }
            if(Math.abs(nums[i]-max[i+indexDifference][2])>=valueDifference){
                System.out.println(Math.abs(nums[i]-max[i+indexDifference][2]));
                    ans[0]=i;
                    ans[1]=max[i+indexDifference][3];
                    return ans;
            }
        }
        return ans;
    }
}