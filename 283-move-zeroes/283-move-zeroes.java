class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int k=0;k<count;k++){
            nums[j++]=0;
        }
    }
}