class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int currRight = points[0][1];
        int count = 1;
        
        for(int i=1; i<points.length; i++)
        {
            if(currRight>=points[i][0])
            {
                currRight = Math.min(currRight,points[i][1]);
            }
            else
            {
                count++;
                currRight = points[i][1];
            }
        }
        return count;
    }
}