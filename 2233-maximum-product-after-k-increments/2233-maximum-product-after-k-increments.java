class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            int val = pq.poll();
            val++;
            pq.add(val);
        }
        long ans=1;
        long m = 1000000007;
        while(!pq.isEmpty()){
            ans=(ans*pq.poll())%m;
        }
        System.out.println(pq); 
        return (int) ans;
    }
}