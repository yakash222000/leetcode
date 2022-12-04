class Solution {
    public int minimumAverageDifference(int[] nums) {
        int res=0,min=Integer.MAX_VALUE;
        long[] arr = new long[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
                arr[i]=arr[i+1]+nums[i];
                //System.out.println(arr[i]);
        }
        long sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++) {
                sum1+=nums[i];
                
                if(i==nums.length-1){
                        sum2=0;
                }
                else{
                        sum2=arr[i+1]/(nums.length-i-1);
                }
                
                int avg=(int)Math.abs(sum1/(i+1)-(sum2));
                //System.out.println(avg +"  "+sum2);
                if(avg<min){
                        
                        res=i;
                        min=avg;
                }
        }
            //System.out.println(min);
            return res;
    }
}