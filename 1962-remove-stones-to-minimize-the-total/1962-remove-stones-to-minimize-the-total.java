class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++){
            p.add(piles[i]);
        }
        for(int i=0;i<k;i++){
            int temp =p.poll();
            int temp1 = temp/2+temp%2;
            p.add(temp1);
        }
        System.out.println(p);
        int sum=0;
        while(!p.isEmpty()){
            sum += p.poll();
        }
        return (int)sum;
    }
}