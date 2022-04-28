class Solution {
    public int minimumEffortPath(int[][] heights) {
        int[][] dirs = new int[][]{
            {0,1},{0,-1},{1,0},{-1,0}
        };
        Integer[][] minDist = new Integer[heights.length][heights[0].length];
        minDist[0][0] = 0;
        
        // row, column, dist
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0,0,0});
        
        int result = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int[] top = q.poll();
            int x = top[0], y = top[1], cost = top[2];
            
            if(x == heights.length-1 && y == heights[0].length-1){
                result = Math.min(result, cost);
                continue;
            }
            
            for(int[] dir:dirs){
                int newx = x+dir[0];
                int newy = y+dir[1];
                
                if(newx >=0 && newx < heights.length && newy >= 0 && newy < heights[0].length){
                    int effort = Math.max(cost, Math.abs(heights[x][y] - heights[newx][newy]));
                    if(minDist[newx][newy] == null || effort < minDist[newx][newy]){
                        minDist[newx][newy] = effort;
                        q.offer(new int[]{newx, newy, effort});
                    }
                }
            }
        }
        return result;
    }
}