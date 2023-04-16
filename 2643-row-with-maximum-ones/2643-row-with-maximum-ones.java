class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0,res=0;
        for(int i=0; i<mat.length ; i++){
            int count =0;
            for(int j : mat[i]){
                if(j==1) count++;
            }
            //System.out.println(count);
            if(count>max){
                res=i;
                max=count;
            }
            
        }
        return new int[]{res,max};
        
    }
}