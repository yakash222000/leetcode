class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int max = -1;
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(arr[j],max);
            }
            res[i]=max;
        }
        return res;
    }
}