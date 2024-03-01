class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder str = new StringBuilder("");
        int count =0 ;
        for(char ch : s.toCharArray()) {
            if(ch == '1') count++;
        }
        int temp= count,temp2 = s.length()-count;
        while(temp-1>0){
            temp--;
            str.append("1");
        }
        while(temp2>0){
            temp2--;
            str.append("0");
            
        }
        str.append("1");
        return str.toString();
    }
}