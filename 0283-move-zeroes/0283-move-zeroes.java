class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind]=nums[i];
                ind++;
            }
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[ind++]=0;
        }
    }
}