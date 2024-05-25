class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        int num=n;
        while(num!=1){
            int sum=0,temp=num;
            while(temp>0){
                
                sum+=(temp%10)*(temp%10);
                //System.out.println(sum);
                temp/=10;
            }
            //System.out.println(sum);
            if(set.contains(sum)) return false;
            set.add(sum);
            num=sum;
        }
        return true;
    }
}