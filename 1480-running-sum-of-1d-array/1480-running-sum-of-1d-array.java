class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans  = new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int sum=nums[i]+ans[i-1];
            ans[i]=sum;
        }
        return ans;
    }
}