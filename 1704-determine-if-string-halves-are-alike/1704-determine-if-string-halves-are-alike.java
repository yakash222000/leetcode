class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        for(int i=0;i<s.length()/2;i++){
                if(check(s.charAt(i))) count1++;
                if(check(s.charAt(s.length()-i-1))) count2++; 
        }
        return count1==count2;
    }
    boolean check(char c){
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||
              c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
                    return true;
            return false;
    }
}