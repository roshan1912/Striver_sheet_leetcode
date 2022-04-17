class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[id++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[id++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[id++]=nums[i];
            }
        }
        return ans;
    }
}