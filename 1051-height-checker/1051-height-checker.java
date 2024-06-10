class Solution {
    public int heightChecker(int[] heights) {
        int[] check = new int[heights.length];
        for(int i=0;i<check.length;i++){
            check[i]=heights[i];
        }
        int ans=0;
        Arrays.sort(check);
        for(int i=0;i<check.length;i++){
            if(heights[i]!=check[i]) ans++;
        }
        return ans;
    }
}