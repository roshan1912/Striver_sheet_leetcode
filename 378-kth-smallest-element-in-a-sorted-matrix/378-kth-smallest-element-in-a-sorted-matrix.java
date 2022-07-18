class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        int val = (matrix.length * matrix[0].length) - k;
        for(int i=0;i<val;i++){
            pq.poll();
        }
        return pq.peek();
    }
}