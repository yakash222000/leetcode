class Solution {
    public int rotatedDigits(int n) {
        int res=0;
            for(int i=1;i<=n;i++){
                    if(isValid(i))res++;
            }
            return res;
    }
    boolean isValid(int n) {
            int count=0;
            while(n>0){
                if(n%10==3 || n%10==4 ||n%10==7) return false;
                if(n%10==2 ||n%10==6 ||n%10==5 ||n%10==9 ) count++;
                n/=10;
            }
            if(count>0) return true;
            return false;
    }
}