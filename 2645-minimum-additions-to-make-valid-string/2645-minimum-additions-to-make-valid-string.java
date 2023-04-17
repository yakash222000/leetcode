class Solution {
    public int addMinimum(String word) {
        int res=0;
        char last='c';
        for(char ch : word.toCharArray()){
            if(last=='c'){
                if(ch=='b'){
                    res++;
                    last='b';
                }
                else if(ch=='c'){
                    res+=2;
                    last='c';   
                }
                else last ='a';
            }
            
            else if(last=='a'){
                if(ch=='a'){
                    res+=2;
                    last='a';
                }
                else if(ch=='c'){
                    res++;
                    last='c';   
                }
                else last ='b';
            }
            
            else {
                if(ch=='a'){
                    res++;
                    last='a';
                }
                else if(ch=='b'){
                    res+=2;
                    last='b';   
                }
                else last ='c';
            }
        }
        if(last=='a') res+=2;
        else if(last=='b') res++;
        
        return res;
        
    }
}