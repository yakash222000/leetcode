class Solution {
    public double average(int[] salary) {
        double res=0;
            double min=1000000,max=0,sum=0;
            for(int i=0;i<salary.length;i++){
                    if(min>salary[i])
                            min=salary[i];
                    if(max<salary[i])
                            max=salary[i];
            }
            for (int j=0;j<salary.length;j++){
                    sum+=salary[j];
            }
            res=(sum-max-min)/(salary.length-2);
            return res;
            
    }
}