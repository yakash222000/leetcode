class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
        HashMap<ArrayList<Integer>,Integer> map1 = new HashMap<>();
        HashMap<ArrayList<Integer>,Integer> map2 = new HashMap<>();
        for(int i=0;i<grid.length;i++){
                ArrayList<Integer> arr = new ArrayList<>();
                for(int j=0;j<grid.length;j++) {
                        arr.add(grid[i][j]);
                }
                map1.put(arr,map1.getOrDefault(arr,0)+1);
        }
        for(int i=0;i<grid.length;i++){
                ArrayList<Integer> arr = new ArrayList<>();
                for(int j=0;j<grid.length;j++) {
                        arr.add(grid[j][i]);
                }
                map2.put(arr,map2.getOrDefault(arr,0)+1);
        }
        for(ArrayList<Integer> k : map1.keySet()){
                if(map2.containsKey(k)) {
                        int temp=map1.get(k)*map2.get(k);
                        ans+=temp;
                }
        }
        // for(ArrayList<Integer> k : map2.keySet()){
        //         if(map1.containsKey(k)) {
        //                 ans+=map1.get(k);
        //         }
        // }
        return ans;
        
            
    }
}