class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        int max1=height[0];
        int max2=height[n-1];
        for(int i =0 ;i<n;i++){
                leftmax[i]=Math.max(max1,height[i]);
                max1=leftmax[i];
        }
        for(int i =n-1 ;i>=0;i--){
                rightmax[i]=Math.max(max2,height[i]);
                max2=rightmax[i];
        }
        int res=0;
        for(int i=1;i<n-1;i++){
                if(height[i]<leftmax[i-1] && height[i]<rightmax[i+1]){
                        res=res+Math.min(leftmax[i-1],rightmax[i+1])-height[i];
                }
        }
        return res;
            
    }
}