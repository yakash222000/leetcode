class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<num;i++){
                if(i+pal(i)==num) return true;
        }
        return false;
    }
    public static int pal(int num){
            int n=num;
            int res=0;
            while(n>0){
                    res*=10;
                    res+=n%10;
                    n/=10;
            }
            return res;
    }
}