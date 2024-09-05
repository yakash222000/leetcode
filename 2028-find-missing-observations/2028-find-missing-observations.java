class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int m = rolls.length;
        int sum = 0;
        for(int i : rolls) sum += i;
        int rSum = mean*(n+m)-sum;
        if(rSum>n*6 || rSum<n) return new int[]{};
        int val = rSum/n;
        for(int i=0 ; i<n ; i++) {
            ans[i]=val;
        }
        int rem = rSum%n;
        for(int i=0;i<rem;i++){
            ans[i]++;
        }
        return ans;
    }
}