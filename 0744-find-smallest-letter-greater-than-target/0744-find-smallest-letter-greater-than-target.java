class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        boolean flag = false;
        int ans='z';
        for(char ch : letters){
            if(ch>target){
                ans=Math.min((int)ch,(int)ans);
                flag = true;
            }
        }
        
        if(flag) return (char)ans;
        else return letters[0];
        
    }
}