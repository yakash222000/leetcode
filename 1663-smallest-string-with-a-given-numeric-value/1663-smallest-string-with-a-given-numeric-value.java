class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder res = new StringBuilder();
        int temp=0;
        for(int i=n;i>=1;i--) {
               if(temp==1) {
                    res.append('z');
                    k=k-26;
                    continue;
               }
               if(i==1){
                    int num=96+k%26;
                    res.append((char)(num));
                    break;
               }
               if((k-1)/(i-1)>=26) {
                       temp=1;
                       int num=96+k%26;
                       if(num==96)num=122;
                       res.append((char)(num));
                       k=k-k%26;
               }
                else{
                        res.append((char)97);
                        k--;
                }      
        }
        return res.toString();
    }
}