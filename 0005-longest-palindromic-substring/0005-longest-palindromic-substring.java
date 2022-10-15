class Solution {
    public String longestPalindrome(String s) {
        int res=1,start=0,end=0;
        int count=1;
        for(int i=1;i<s.length();i++){
                int left=i-1,right=i+1;
                count=1;
                while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                        count+=2;
                        left--;
                        right++;
                }
                if(count>res){
                        start=left+1;
                        end=right-1;
                        res=count;
                }
                count=0;
                left=i-1;
                right=i;
                while( left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                        left--;
                        right++;
                        count+=2;
                }
                if(count>res){
                        start=left+1;
                        end=right-1;
                        res=count;
                }     
        }
        if(res==1) return s.substring(0,1);
        return s.substring(start,end+1);
    }
}