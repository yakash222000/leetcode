class Solution {
    public boolean detectCapitalUse(String word) {
            int temp=0;
            if(word.charAt(0)>95){
                    temp=0;
            }
            if(word.charAt(0)<95){
                    temp=1;
            }
        for (int i=1;i<word.length();i++){
                if(temp==1){
                        if(word.charAt(i)>95&& i==1){
                                temp=0;
                        }
                        if(word.charAt(i)>95 && i!=1){
                                return false;
                        }
                }
                if(temp==0){
                        
                        if(word.charAt(i)<95){
                                return false;
                        }  
                }
        }
            return true;
    }
}