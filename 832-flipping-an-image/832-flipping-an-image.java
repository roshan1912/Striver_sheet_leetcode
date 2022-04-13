class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r =image.length;
        int c =image[0].length;
        int[][] result = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                result[i][j] = image[i][c-j-1];
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                if(result[i][j]==1){
                    result[i][j]=0;
                }
                else{
                    result[i][j]=1;
                }   
            }
        }
        return result;
    }
}