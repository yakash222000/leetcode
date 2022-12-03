class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=1) arr[0]=1;
        for(int i=1;i<arr.length;i++) {
                if(Math.abs(arr[i]-arr[i-1])>1){
                        if(arr[i]-arr[i-1]>0){
                                arr[i]=arr[i-1]+1;
                        }
                }
        }
        return arr[arr.length-1];
    }
}