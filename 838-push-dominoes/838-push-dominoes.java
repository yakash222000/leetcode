class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0;i<n;i++){
                if(dominoes.charAt(i)=='R'){
                        int count=1;
                        right[i]=count++;
                        i++;
                        while(i<n && dominoes.charAt(i)=='.'){
                                right[i]=count++;
                                i++;
                        }
                        i--;
                }
        }
        
        for(int i=n-1;i>=0;i--){
                if(dominoes.charAt(i)=='L'){
                        int count=1;
                        left[i]=count++;
                        i--;
                        while(i>=0 && dominoes.charAt(i)=='.'){
                                left[i]=count++;
                                i--;
                        }
                        i++;
                }
        }
         // for(int i=0;i<n;i++){
         //         System.out.print(right[i]);
         // }
         //     System.out.println();
         // for(int i=0;i<n;i++){
         //         System.out.print(left[i]);
         // }
         //    System.out.println();
            StringBuilder res =new StringBuilder();
            for(int i=0;i<n;i++){
                    if(dominoes.charAt(i)=='.'){
                            if(right[i]==left[i]){
                            res.append('.');
                    }
                    if((right[i]>left[i] && left[i]!=0) 
                       || (left[i]!=0 && right[i]==0)){
                            res.append('L');
                    }
                    if((left[i]>right[i] && right[i]!=0)
                       || (right[i]!=0 && left[i]==0)){
                            res.append('R');
                    }
                    }
                    else{
                            res.append(dominoes.charAt(i));
                    }
            }
            
            return res.toString();
    }
        
}