class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int overallprofit=0;
        int profit=0;
      for(int i =0 ;i<prices.length;i++){
          if(prices[i]< min){
              min=prices[i];
          }
          profit=prices[i]-min;

          if(profit>overallprofit){
              overallprofit=profit;
          }
      }
       return overallprofit;  
    }
   
}