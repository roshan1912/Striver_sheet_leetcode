class Solution {
    static int mod = (int)(Math.pow(10,9)+7);
    public int sol(String s1,String s2,int ind1,int ind2,int[][]dp){
         if(ind2<0)
            return 1;
        if(ind1<0)
            return 0;

        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];

        if(s1.charAt(ind1)==s2.charAt(ind2)){
            int leaveOne = sol(s1,s2,ind1-1,ind2-1,dp);
            int stay = sol(s1,s2,ind1-1,ind2,dp);

            return dp[ind1][ind2] = (leaveOne + stay)%mod;
        }

        else{
            return dp[ind1][ind2] = sol(s1,s2,ind1-1,ind2,dp);
        }
    } 
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return sol(s,t,n-1,m-1,dp);
    }
}