class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int temp = prices[i]-min;
            if(temp>max) max = temp;
            if(prices[i]<min) min = prices[i];
        }
        return max;
    }
}