class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[][] res = new char[numRows][s.length()];
        for(char[] ch : res){
                Arrays.fill(ch,' ');
        }
        int x=0,y=0,i=0;
        while(true){
                while(i<s.length() && x<numRows){
                        res[x++][y]=s.charAt(i++);
                }
                if(i==s.length())break;
                x-=2;
                y++;
                while(i<s.length() && x>=0){
                        res[x--][y++]=s.charAt(i++);
                }
                if(i==s.length())break;  
                y--;
                x+=2;
        }
            StringBuilder sb = new StringBuilder();
            for(i=0;i<numRows;i++){
                    for(int j=0;j<s.length();j++){
                            if(res[i][j]!=' '){
                                    sb.append(res[i][j]);       
                            }
                    }
            }
            return sb.toString();
    }
}