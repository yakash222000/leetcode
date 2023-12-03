class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        int n=points.length;
        for (int i=0;i<n-1;i++){
        time+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return time;
    }
}