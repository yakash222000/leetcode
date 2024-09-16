class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[][] time = new int[n][2];
        int index = 0;
        for(String s : timePoints ) {
            int hours = Integer.parseInt(s.substring(0,2));
            int min = Integer.parseInt(s.substring(3,5));
            time[index][0] = hours;
            time[index++][1] = min;
        }
        
        Arrays.sort(time,(a, b) -> {
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });
        
        int ans = Math.min((time[n-1][0]-time[0][0])*60+(time[n-1][1]-time[0][1]), 
                          (24+time[0][0]-time[n-1][0])*60+(time[0][1]-time[n-1][1]));
        
        for(int i=1;i<n;i++ ) {
            ans = Math.min(ans, (time[i][0]-time[i-1][0])*60+(time[i][1]-time[i-1][1]));
        }
        return ans;
    }
}