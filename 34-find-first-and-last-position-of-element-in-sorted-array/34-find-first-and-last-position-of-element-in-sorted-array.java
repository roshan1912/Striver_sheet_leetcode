class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && last==-1){
                first=i;
                last=i;
            }else if(nums[i]==target){
                last=i;
            }
        }
        res[0]=first;
        res[1]=last;
        return res;
    }
}