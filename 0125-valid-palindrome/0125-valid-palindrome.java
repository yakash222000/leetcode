class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            int ascii=(int)ch;
            if((ascii>=48 && ascii<=57) || (ascii>=97 && ascii<=122)){
                str.append(ch);
            }
            else if(ascii>=65 && ascii<=90){ 
                str.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(str);
        return palindrome(str.toString());
    }
    
    public boolean palindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        
        return true;
    }
}