class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int item : nums ){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        Set<Integer> keys = map.keySet();
        for(int val : keys){
            // if(map.containsKey(val)){
            if(map.get(val) == 2){
                ans.add(val);
            }
        }
        return ans;
    }
}