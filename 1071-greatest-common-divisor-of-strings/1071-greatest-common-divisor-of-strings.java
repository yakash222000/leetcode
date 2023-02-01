class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
                String curr=str1.substring(0,i+1);
                boolean t = true;
                for(int j=0;j<Math.max(str1.length(),str2.length());j+=i+1){
                        if(j+i<str1.length() && !curr.equals(str1.substring(j,j+i+1))){
                                t=false;
                                break;
                        }
                        if(j+i<str2.length() && !curr.equals(str2.substring(j,j+i+1))){
                                t=false;
                                break;
                        }
                }
                if(str2.length()%curr.length()!=0 ||
                   str1.length()%curr.length()!=0 ) 
                        t=false;
                if(t){
                        ans.setLength(0);
                        ans.append(curr);
                }
        }
        return ans.toString();
    }
}