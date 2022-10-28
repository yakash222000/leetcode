class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n]; 
        int i=0,j=0,rowStart=0,columnStart=0,rowEnd=n-1,columnEnd=n-1,k=1;
        while(k<=n*n) {
                while(k<=n*n && j<=columnEnd){
                        res[i][j++]=k++;
                }
                if(k>n*n) break;
                j--;
                i++;
                rowStart++;
                while(k<=n*n && i<=rowEnd) {
                        res[i++][j]=k++;
                }
                if(k>n*n) break;
                i--;
                j--;
                columnEnd--;
                while(k<=n*n && j>=columnStart) {
                        res[i][j--]=k++;
                }
                if(k>n*n) break;
                i--;
                j++;
                rowEnd--;
                while(k<=n*n && i>=rowStart) {
                        res[i--][j]=k++;
                }
                if(k>n*n) break;
                i++;
                j++;
                columnStart++;
        }
            return res;
    }
}