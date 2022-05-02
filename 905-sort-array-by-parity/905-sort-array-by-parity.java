class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] nums1 = new int[nums.length];
        int start =0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums1[start++]=nums[i];
            }else{
                nums1[end--]=nums[i];
            }
        }
        return nums1;
    }
}