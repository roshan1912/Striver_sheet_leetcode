class Solution {
    public int jump(int[] nums) {
        int curr=0;
        int jumps=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            if(i==curr){
                jumps++;
                curr = max;
            }
        }
        return jumps;
    }
}