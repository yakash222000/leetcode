class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0,i=0;
        while(i<costs.length){
                coins-=costs[i];
                if(coins<0) break;
                ans++;
                i++;
        }
        return ans;
        
    }
}