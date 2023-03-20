class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =1,ans=0,check=0,m=flowerbed.length;
        if(m==1){
            if(flowerbed[0]==0){
                if(n<=1) return true;
                else return false;
            }
            else{
                if(n==0) return true;
                else return false;
            }
        }
        for(int i=0;i<m;i++){
            if(flowerbed[i]==0){
                count++;
            }
            else{
                count=0;
                check=1;
            }
            if(count>1 && count%2==1){
                ans++;
            }
        }
        if(check == 0){
            count--;
            return (count/2+count%2>=n);
        }
        if(count>1) ans++;
        if(ans>=n) return true;
        return false;
    }
}