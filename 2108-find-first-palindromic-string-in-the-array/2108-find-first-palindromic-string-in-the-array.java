class Solution {
    public String firstPalindrome(String[] words) {
        for (String s:words){
                int j=s.length()-1,i=0,temp=0;
                while(i<j){
                        if(s.charAt(i)!=s.charAt(j)){
                                temp=1;
                                break;
                        }
                        i++;
                        j--;
                }
                if(temp==0){
                     return s;   
                }
                
        }
            return "";
    }
}