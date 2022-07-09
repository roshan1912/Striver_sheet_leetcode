class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int val = len/3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int key=nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>val)
                ans.add(i);
        }
        return ans;
    }
}