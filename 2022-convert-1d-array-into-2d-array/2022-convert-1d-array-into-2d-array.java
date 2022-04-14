class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        int num=0;
        if(original.length==m*n){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    res[i][j]=original[num++];
                }
            }
            return res;
        }
        int ans[][]=new int[0][0];
        return ans;
    }
}