class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        int sum=0;
        int sum2=0;
        for(int key:map.keySet()){
            sum += map.get(key)/2;
            sum2 += map.get(key)%2;
        }
        int[] ans = new int[2];
        ans[0]=sum;
        ans[1]=sum2;
        return ans;
    }
}