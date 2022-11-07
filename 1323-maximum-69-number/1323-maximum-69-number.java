class Solution {
    public int maximum69Number (int num) {
        int rev=0,rem=0,res=0,count=0;
        while(num>0){
                rev*=10;
                rem=num%10;
                if(rem==6) count++;
                rev+=rem;
                num/=10;
        }
        while(rev>0){
                res*=10;
                rem=rev%10;
                if(rem==6){
                        if(count>0){
                                rem=9;
                                count=0;
                        }
                }
                res+=rem;
                rev/=10;
        }
            return res;
    }
}