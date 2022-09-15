class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        if(target>matrix[n-1][m-1] && target<matrix[0][0]) return false;
        int row=0;
        for(int i=0;i<n;i++){
                if(matrix[i][m-1]==target){
                        return true;       
                }
                if(matrix[i][m-1]>target){
                        row=i;
                        break;
                }      
        }
        int l=0,r=m-1;
        while(l<=r){
                int mid=(l+r)/2;
                if(matrix[row][mid]==target){
                        return true;
                }
                if(matrix[row][mid]>target){
                        r=mid-1;
                }
                else{
                        l=mid+1;
                }
        }
            return false;
    }
}