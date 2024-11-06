class Solution {
    public boolean isPowerOfTwo(int n) {
        int setBits = 0;
        while(n>0) {
            if((n&1)==1) {
                setBits++;
            }
            n = n>>1;
        }
        return setBits == 1 ? true : false;
    }
}