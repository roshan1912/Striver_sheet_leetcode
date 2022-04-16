class Solution {
    public int minSetSize(int[] arr) {
        int size=0,res=0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num: arr) counts.put(num, counts.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        maxHeap.addAll(counts.keySet());
        
        int n=arr.length/2;
        while(size < n) {
            int curr = maxHeap.remove();
            size += counts.get(curr);
            res++;
        }
        return res;
    }
}