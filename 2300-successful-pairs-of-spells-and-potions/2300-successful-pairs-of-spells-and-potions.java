class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length,m=potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            int low=0,high=m-1;
            long curr=spells[i];
            while(low<=high){
                int mid = (high+low)/2;
                if(curr*potions[mid]>=success && (mid==0 || curr*potions[mid-1]<success)){
                    ans[i]= m - mid;
                    break;
                }
                if(curr*potions[mid]<success && mid==m-1 ){
                    ans[i]= m - mid -1;
                    break;
                }
                if(curr*potions[mid]<success){
                    low=mid+1;
                }
                if(curr*potions[mid]>=success){
                    high = mid-1;
                }
            }
        }
        return ans;
    }
}