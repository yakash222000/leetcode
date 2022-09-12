class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),i=0,j=0,max=0;
        boolean t=true;
        int[] arr = new int[128];
        while(i<n){
                if(arr[(int)s.charAt(i)]>0){
                        t=false;
                        max=Math.max(max,i-j);
                        while(arr[(int)s.charAt(i)]>0){
                                arr[(int)s.charAt(j)]--;
                                j++;
                        }
                }
                arr[(int)s.charAt(i)]++;
                i++;
                
        }
        max=Math.max(max,i-j);
        return max;
    }
}