class Solution {
    public boolean increasingTriplet(int[] nums) {
        int s=Integer.MAX_VALUE;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=s){
                s=nums[i];
            }
            else if(nums[i]<=m){
                m=nums[i];
            }
            else if(nums[i]>m){
                return true;
            }
        }
        return false;
    }
}