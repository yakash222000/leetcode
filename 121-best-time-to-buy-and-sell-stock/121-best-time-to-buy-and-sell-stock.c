

int maxProfit(int* prices, int pricesSize){
    if(pricesSize==0||pricesSize==1){
        return 0;
    }
    int buy=prices[0],profit=0;
   int i=1;
  while(i<pricesSize){
          if(profit<prices[i]-buy){
        profit=prices[i]-buy;  
    }
          
        if(prices[i]<buy){
            buy=prices[i];  
        }
      
    
i++;
}
    
    
        return profit;
}