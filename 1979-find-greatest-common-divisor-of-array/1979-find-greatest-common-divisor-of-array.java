class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0];
        int large = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large)
                large=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small)
                small=nums[i];
        }
        int ans=-1;
        for(int i=1;i<=small;i++){
            if(small%i==0 && large%i==0)
                ans=i;
        }
        return ans;
    }
}