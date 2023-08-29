class Solution {
    public int bestClosingTime(String customers) {
        int[] ans = new int[customers.length()+1];
        int[] ans1 = new int[customers.length()+1];
        int countY=0,countN=0;
            int res=0,min=Integer.MAX_VALUE;
        for(int i=ans.length-1;i>=1;i--) {
                if(customers.charAt(i-1)=='Y') countY++;
                ans[i-1]=countY;
        }
        for(int i=1;i<ans.length;i++) {
                if(customers.charAt(i-1)=='N') countN++;
                ans1[i]+=countN;
        }
            for(int i=0;i<ans.length;i++){
                    if(ans[i]+ans1[i]<min){
                            res=i; 
                            min=ans[i]+ans1[i];
                    }
            }
            return res;
            
            
         
    }
}