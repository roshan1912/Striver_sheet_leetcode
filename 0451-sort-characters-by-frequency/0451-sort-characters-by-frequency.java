class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1); 
        }
        
	    PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> (map.get(b) -map.get(a)));
	    heap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!heap.isEmpty()){
            char ch=heap.poll();
            for(int j=0;j<map.get(ch);j++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}