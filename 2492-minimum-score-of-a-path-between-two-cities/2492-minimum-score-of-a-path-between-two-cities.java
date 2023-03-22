class Solution {
    int ans = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i =0 ;i<=n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int[] i : roads){
            arr.get(i[0]).add(i[1]);
            arr.get(i[1]).add(i[0]);
        }
        for(int[] i : roads){
            if(map.containsKey(i[0])){
                map.get(i[0]).put(i[1],i[2]);
            }
            else{
                map.put(i[0],new HashMap<>());
                map.get(i[0]).put(i[1],i[2]);
            }
            if(map.containsKey(i[1])){
                map.get(i[1]).put(i[0],i[2]);
            }
            else{
                map.put(i[1],new HashMap<>());
                map.get(i[1]).put(i[0],i[2]);
            }
        }
        //System.out.println(map);
        dfs(map,arr,1,1,new HashSet<Integer>());
        
        return ans ;
    }
    
    public void dfs(HashMap<Integer,HashMap<Integer,Integer>> map, ArrayList<ArrayList<Integer>> arr,int last,int curr,HashSet<Integer> set){
        if(set.contains(curr)) return;
        set.add(last); 
        for(int i : arr.get(curr)){
            ans = Math.min(ans,map.get(curr).get(i));
            dfs(map,arr,curr,i,set);
        }
           
    }
}
