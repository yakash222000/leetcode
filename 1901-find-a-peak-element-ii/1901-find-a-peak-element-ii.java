class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0,high=mat[0].length;
        while(low<=high){
            int mid = (low+high)>>1;
            int row = max(mat,mid);
            int left = (mid-1>=0) ? mat[row][mid-1] : -1;
            int right = (mid+1<mat[0].length) ? mat[row][mid+1] : -1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{0,0};
    }
    
    public int max(int[][] mat,int mid){
        int ans=0;
        int max=0;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][mid]){
                max=mat[i][mid];
                ans=i;
            }
        }
        return ans;
    }
}