class Solution {
    public int minFlips(int a, int b, int c) {
        int ans=0;
        while(a!=0 ||b!=0 ||c!=0){
            int x=a&1,y=b&1,z=c&1;
            System.out.println(x+" "+y+" "+z);
            if(x==0 && y==0 && z==1) ans++;
            else if(x==1 && y==1 && z==0) ans+=2;
            else if((x==1 || y==1) && z==0){
                ans++;
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return ans;
    }
}