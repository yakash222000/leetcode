class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res  = new ArrayList<>();
        int i=0,j=0,rowstart=0,columnstart=0,columnEnd=matrix[0].length
        ,rowEnd=matrix.length,k=matrix.length*matrix[0].length;
        while(k>0) {
                while(j<columnEnd && k>0){
                        res.add(matrix[i][j++]);
                        k--;
                }
                j--;
                i++;
                rowstart++;
                if(k==0) break;
                while(i<rowEnd && k>0){
                        res.add(matrix[i++][j]);
                        k--;
                }
                i--;
                j--;
                columnEnd--;
                if(k==0) break;
                while(j>=columnstart && k>0){
                        res.add(matrix[i][j--]);
                        k--;
                }
                i--;
                j++;
                rowEnd--;
                if(k==0) break;
                while(i>=rowstart && k>0){
                        res.add(matrix[i--][j]);
                        k--;
                }
                i++;
                j++;
                columnstart++;
                if(k==0) break;
        }
            return res;
    }
}