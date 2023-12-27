class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length,res=0,i=0,j=1;
        while(j<n) {
                if(colors.charAt(i)==colors.charAt(j)){
                        if(neededTime[i]>neededTime[j]){
                                res+=neededTime[j];
                                j++;
                        }
                        else{
                                res+=neededTime[i];
                                i=j;
                                j++;
                        }
                }
                else{
                        i=j;
                        j++;
                }
        }
        return res;
    }
}