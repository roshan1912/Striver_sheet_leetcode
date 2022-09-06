class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int T=0;T<=amount;T++){
            if(T%coins[0]==0) dp[0][T]=1;
            else dp[0][T] = 0;
        }
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                int nottake =dp[ind-1][t];
                int take=0;
                if(coins[ind]<=t)
                    take = dp[ind][t-coins[ind]];
                dp[ind][t]= take+nottake;
            }
        }
        int ans = dp[n-1][amount];
        // if(ans>=(int)Math.pow(10,9)) return -1;
        return ans;
    }
}