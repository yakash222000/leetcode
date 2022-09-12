class Solution {
    public int reverse(int x) {
        int temp;
            boolean t=false;
            if(x<0){
                    temp=-x;
                    t=true;
            }
            else
                    temp=x;
            
            long sum=0;
            while(temp>0){
                    sum*=10;
                    sum+=temp%10;
                    temp/=10;       
            }
            if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE) return 0;
            if(t)return (int)sum*(-1);
            return (int)sum;
    }
}