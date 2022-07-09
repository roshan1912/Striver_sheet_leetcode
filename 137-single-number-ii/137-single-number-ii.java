class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int ans=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ans=i;
            }
        }
        return ans;
    }
}