class Solution {
    public List<String> generateParenthesis(int n) {
        List<String > result = new ArrayList<>();
        String str = "";
        help(n,result,0,0,str);
        return result;
    }
    public void help(int n,List<String> res,int left,int right,String str) {
            if(str.length()==2*n){
                    res.add(str.toString());
                    return;
            }
            if(left<n){
                    help(n,res,left+1,right,str+'(');
            }
            if(left>right){
                    help(n,res,left,right+1,str+')');
            }
    }
}