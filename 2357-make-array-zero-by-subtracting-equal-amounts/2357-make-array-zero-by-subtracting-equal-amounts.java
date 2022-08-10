class Solution { 
    public int minimumOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int key:map.keySet()){
            if(key!=0)
                count++;
        }
        return count;
    }
}