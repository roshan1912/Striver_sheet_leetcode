class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq = new PriorityQueue<>((a,b)->b.getKey()-a.getKey());
        for(int i=0;i<points.length;i++){
            pq.add(new Pair(points[i][0]*points[i][0]+points[i][1]*points[i][1],new Pair(points[i][0],points[i][1])));
            if(pq.size()>k)
                pq.poll();
        }
        int id=0;
        while(!pq.isEmpty()){
            int x = pq.peek().getValue().getKey();
            int y = pq.peek().getValue().getValue();
            ans[id][0]=x;
            ans[id][1]=y;
            id++;
            pq.poll();
        }
        return ans;
    }
}