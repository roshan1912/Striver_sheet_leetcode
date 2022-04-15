class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length-1;
        List<Integer> list = new ArrayList<>();
        for(int i=n,m=0;m<matrix.length;)
          {
            list.add(matrix[i][m]);
            i--;
            if(i<0)
            {
                i=n;
                m++;
            }
        }
        for(int i=0,x=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++,x++)
            matrix[i][j] = list.get(x);
        }
    }
}