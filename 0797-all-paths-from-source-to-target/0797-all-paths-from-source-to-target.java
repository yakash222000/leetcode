class Solution {
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer> temp = new ArrayList<>();
        help(temp,graph,0);
        //System.out.println(temp);
        return ans;
    }
    void help(ArrayList<Integer> temp,int[][] graph , int index){
            temp.add(index);
            if(index+1==graph.length){
                    ArrayList ArrList2 = (ArrayList)temp.clone();
                    ans.add(ArrList2 );
                    temp.remove(temp.size()-1);
                    return;
            }
            for(int i = 0;i < graph[index].length;i++){
                    help(temp,graph,graph[index][i]);
                    
            }
            temp.remove(temp.size()-1);
    }
}