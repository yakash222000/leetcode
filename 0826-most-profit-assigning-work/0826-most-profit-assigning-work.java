class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[][] arr = new int[difficulty.length][2];
        for(int i=0;i<profit.length;i++){
            arr[i][0]=difficulty[i];
            arr[i][1]=profit[i];
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int ans=0;
        for(int i : worker){
            int max=0;
            for(int j=0;j<profit.length && arr[j][0]<=i;j++){
                max=Math.max(max,arr[j][1]);
            }
            ans+=max;
        }
        return ans;
        
    }
}