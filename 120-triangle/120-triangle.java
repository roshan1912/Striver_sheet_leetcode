class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] dp = new int[n][n];
        List<Integer> t = new ArrayList(triangle.get(n-1));
        for(int j=0;j<n;j++)
            dp[n-1][j]=t.get(j);
        for(int i=n-2;i>=0;i--){
            List<Integer> temp = new ArrayList(triangle.get(i));
            for(int j=i;j>=0;j--){
                int d= temp.get(j)+dp[i+1][j];
                int dg = temp.get(j)+dp[i+1][j+1];
                dp[i][j] = Math.min(d,dg);
            }
        }
        return dp[0][0];
    }
}