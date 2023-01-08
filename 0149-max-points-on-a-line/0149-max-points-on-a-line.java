class Solution {
    public int maxPoints(int[][] points) {
        int max=0;
        HashMap<Float,Integer> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
                for(int j=i+1;j<points.length;j++){
                        float slope = 0;
                        if(points[i][0]-points[j][0]==0) slope = Float.MAX_VALUE;
                        else slope = (points[i][1]-points[j][1])/(float)(points[i][0]-points[j][0]);
                        if(slope==0)slope=Math.abs(slope);
                        map.put(slope,map.getOrDefault(slope,0)+1);
                        //System.out.println(map.get(slope)+"  "+slope);
                        max=Math.max(map.get(slope),max);
                }
                map.clear();
                
        }
        return max+1;   
    }
}