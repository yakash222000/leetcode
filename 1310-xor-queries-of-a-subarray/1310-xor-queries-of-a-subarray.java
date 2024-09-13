class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int[] ans = new int[queries.length];
        prefix[0] = arr[0];
        suffix[arr.length-1] = arr[arr.length-1];
        for(int i=1;i<arr.length;++i) {
            prefix[i] = prefix[i-1]^arr[i];
        }
        for(int i=arr.length-2;i>=0;--i) {
            suffix[i] = suffix[i+1]^arr[i];
        }
        int index = 0;
        for(int[]  i : queries) {
            int l = i[0];
            int r = i[1];
            int left = (l==0) ? 0 : prefix[l-1];
            int right = (r==arr.length-1) ? 0 : suffix[r+1];
            ans[index++] = suffix[0] ^ left ^ right;
        }
        return ans;
        
    }
}