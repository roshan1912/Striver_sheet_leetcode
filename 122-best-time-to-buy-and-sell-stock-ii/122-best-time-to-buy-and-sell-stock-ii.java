class Solution {
    public int sol(int ind,int buy,int[] arr,int n,int[][] dp){
        if(ind==n) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        if(buy==1){
            return dp[ind][buy]=Math.max(-arr[ind] + sol(ind+1,0,arr,n,dp), 0+sol(ind+1,1,arr,n,dp));
        }else{
            return dp[ind][buy]=Math.max(arr[ind] + sol(ind+1,1,arr,n,dp), 0+sol(ind+1,0,arr,n,dp));
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return sol(0,1,prices,prices.length,dp);
    }
}