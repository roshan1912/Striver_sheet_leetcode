class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int num : nums){
            if(map.get(num)==1 && !map.containsKey(num+1) && !map.containsKey(num-1)){
                ans.add(num);
            }
        }
        return ans;
    }
}