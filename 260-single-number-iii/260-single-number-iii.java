class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                temp.add(i);
            }
        }
        int[] ans = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}