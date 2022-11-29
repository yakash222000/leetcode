class Solution {
        int currx=0,curry=0;
    public String alphabetBoardPath(String target) {
        StringBuilder res = new StringBuilder();
        for(char c : target.toCharArray()) {
                //System.out.println((int)c-'a');
                help(res,c);
        }
        //int x=0%5;
        return res.toString();   
    }
    void help(StringBuilder res,char c) {
            int x=(c-'a')%5,y=(c-'a')/5;
             //System.out.println(x+"  "+y);
            if(x<currx){
                    while(x!=currx){
                            res.append('L');
                            currx--;
                    }
            }
            
            if(y>curry){
                    while(y!=curry){
                            res.append('D');
                            curry++;
                    }
            }
            if(y<curry){
                    while(y!=curry){
                            res.append('U');
                            curry--;
                    }
            }
            if(x>currx){
                    while(x!=currx){
                            res.append('R');
                            currx++;
                    }
            }
            
            res.append('!');
            
            
    }
}