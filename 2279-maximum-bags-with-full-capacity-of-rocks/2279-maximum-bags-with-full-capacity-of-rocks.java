class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] arr = new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
                arr[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        int res=0;
        while(res<rocks.length && additionalRocks>=0){
                if(additionalRocks-arr[res]>=0){
                        additionalRocks-=arr[res];
                        res++;
                }
                else
                        break;
                
        }
        return res;
    }
}