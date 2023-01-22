class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] ans = new int[score.length][score[0].length];
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
                map.put(score[i][k],i);
        }
        int row=0;
        for(int j : map.keySet()){
              int curr=map.get(j);
              for(int i=0;i<score[0].length;i++){
                      ans[row][i]=score[curr][i];
              }  
              row++;
        }
        return ans;
    }
}