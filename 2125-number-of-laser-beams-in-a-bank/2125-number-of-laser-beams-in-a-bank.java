class Solution {
    public int numberOfBeams(String[] bank) {
            int temp1=0,temp2=0;
            int count=0;
        for (int i=0;i<bank.length;i++){
                temp1=0;
                for(int j=0;j<bank[i].length();j++){
                        if(bank[i].charAt(j)=='1'){
                                temp1++;
                        }
                }
                if(temp1!=0){
                        count=count+temp1*temp2;
                        temp2=temp1;
                        
                }
        }
            return count;
    }
}