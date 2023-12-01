class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s=word1[0];
        String t=word2[0];
            for (int i=1;i<word1.length;i++){
                    s+=word1[i];
            }
            for (int i=1;i<word2.length;i++){
                    t+=word2[i];
            }
            return s.equals(t);
    }
}