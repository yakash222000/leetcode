class Solution {
    public String addBinary(String a, String b) {
        int s1=a.length()-1,s2=b.length()-1;
        int carry=0;
        StringBuilder ans = new StringBuilder();
        while(s1>=0 && s2>=0){
             int val=a.charAt(s1)-'0'+(int)b.charAt(s2)-'0'+carry;
             if(val==0){
                     ans.insert(0,"0");
                     carry=0;
             }   
             else if(val==1) {
                     ans.insert(0,"1");
                     carry=0;
             }
             else if(val==2){
                     ans.insert(0,"0");
                     carry=1;
             }
             else {
                     ans.insert(0,"1");
                     carry=1;
             }
             System.out.println(val);
             s1--;
             s2--;
        }
        if(s1>=0){
               while(s1>=0){
                       int val=a.charAt(s1)-'0'+carry;
                       if(val==0){
                          ans.insert(0,"0");
                          carry=0;
                       }   
                       else if(val==1) {
                          ans.insert(0,"1");
                          carry=0;
                       }
                       else {
                           ans.insert(0,"0");
                           carry=1;
                       }
                       System.out.println(val);
                       s1--;
               } 
        }
            
        if(s2>=0){
               while(s2>=0){
                       int val=b.charAt(s2)-'0'+carry;
                       if(val==0){
                          ans.insert(0,"0");
                          carry=0;
                       }   
                       else if(val==1) {
                          ans.insert(0,"1");
                          carry=0;
                       }
                       else {
                           ans.insert(0,"0");
                           carry=1;
                       }
                       System.out.println(val);
                       s2--;
               } 
        }
        if(carry==1){
                ans.insert(0,"1");
        }
        return ans.toString();
    }
}