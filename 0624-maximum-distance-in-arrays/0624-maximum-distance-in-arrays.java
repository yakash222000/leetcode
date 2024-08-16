class Solution {
    public int maxDistance(List<List<Integer>> arr) {
        int min = arr.get(0).get(0), max = arr.get(0).get(arr.get(0).size()-1); 
        int ans = 0;
        for(int  i=1 ; i<arr.size() ; ++i) {
            int minCurr = arr.get(i).get(0);
            int maxCurr = arr.get(i).get(arr.get(i).size()-1);
            //System.out.println(max+" "+min+" "+minCurr+" "+maxCurr);
            ans = Math.max(ans , Math.max(max - minCurr , maxCurr - min));
            min = Math.min(min , minCurr);
            max = Math.max(max , maxCurr);
        }
        return ans;        
    }
}