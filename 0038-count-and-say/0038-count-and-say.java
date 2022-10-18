class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        StringBuilder str = new StringBuilder("1");
        for(int j=2;j<=n;j++){
                res.setLength(0);
                for(int i=0;i<str.length();i++){
                        int count=1;
                        char temp=str.charAt(i);
                        if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){ 
                                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                                        count++;
                                        i++;
                                }
                                res.append(Integer.toString(count));
                                res.append(temp);
                        }
                        else{
                                res.append("1");
                                res.append(temp);
                        }
                }
                str.setLength(0);
                str.append(res);
                
        }
            return res.toString();
    }
}