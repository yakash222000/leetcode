class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (high+low)>>1;
            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(high==-1) return false;
        return bs(matrix,high,target);
    }
    
    public boolean bs(int[][] arr,int i,int x){
        int low=0,high=arr[0].length-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(arr[i][mid]==x) return true;
            if(arr[i][mid]>x) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}