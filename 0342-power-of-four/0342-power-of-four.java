class Solution {
    public boolean isPowerOfFour(int n) {
            if(n==1||n==4) return true;
        int i=2;
            while((int)Math.pow(4,i)<(int)Math.pow(2,31)-1){
                    if((int)Math.pow(4,i)==n) return true; 
                    i++;
            }
            
            return false;
    }
}