class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long ans=0;
        int[] nodes = new int[n];
        for(int[] i : roads){
            nodes[i[0]]++;
            nodes[i[1]]++;
        }
        Arrays.sort(nodes);
        int temp=1;
        for(int i : nodes){
            ans+=(long)i*temp;
            temp++;
        }
        return ans;
    }
}