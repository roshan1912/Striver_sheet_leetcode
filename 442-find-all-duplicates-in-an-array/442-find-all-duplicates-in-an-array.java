class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int item : nums ){
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>1)
                ans.add(entry.getKey());
        }
        return ans;
    }
}