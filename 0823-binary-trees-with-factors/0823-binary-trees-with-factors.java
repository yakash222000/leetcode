class Solution {
        private int MOD=1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
                long count = 1l;
                for(int j=0;j<i;j++){
                     if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                             count+=map.get(arr[j])*map.get(arr[i]/arr[j]);
                     }   
                        
                }
                map.put(arr[i],count);
        }
        long res=0l;
        for(int i : map.keySet()){
                res+=map.get(i);
        }
        return (int)(res%MOD);
    }
}