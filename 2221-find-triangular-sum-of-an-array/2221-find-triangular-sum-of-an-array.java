class Solution {
    public int triangularSum(int[] nums) {
        int count=0;
        while(nums.length-count>1){
            for(int i=0;i<nums.length-count-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            count++;
        }
        int res =nums[0];
        return res;
    }
}