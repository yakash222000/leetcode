class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] res= new int[26];
            for (int i=0;i<sentence.length();i++){
                    res[sentence.charAt(i)-97]++;
            }
            for(int i=0;i<26;i++){
                    if(res[i]==0){
                            return false;
                    }
            }
            return true;
    }
}