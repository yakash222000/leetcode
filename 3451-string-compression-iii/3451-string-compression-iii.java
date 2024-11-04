class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int sum=1;
        for(int i=0;i<word.length();i++){
            if(i==word.length()-1 || word.charAt(i)!=word.charAt(i+1) || sum==9){
                ans.append(Integer.toString(sum));
                ans.append(word.charAt(i));
                sum=1;
            }
            else{
                sum++;
            }
        }
        
        return ans.toString();
    }
}