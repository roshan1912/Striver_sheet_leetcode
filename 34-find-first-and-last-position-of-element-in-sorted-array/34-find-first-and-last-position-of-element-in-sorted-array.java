class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int f=-1;
        int l=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && f==-1){
                f=i;
                l=i;
            }
            if(nums[i]==target){
                l=i;
            }
        }
        ans[0]=f;
        ans[1]=l;
        return ans;
    }
}