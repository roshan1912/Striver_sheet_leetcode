class Solution {
    public int maxProfit(int[] prices) {
        int currprofit=0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            currprofit = currprofit + prices[i]-prices[i-1];
            if(currprofit>maxprofit){
                maxprofit=currprofit;
            }
            if(currprofit<0){
                currprofit=0;
            }        
        }
        return maxprofit;
    }
}