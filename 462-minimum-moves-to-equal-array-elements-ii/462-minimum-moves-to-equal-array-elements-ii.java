class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=nums[n/2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=Math.abs(nums[i]-mid);
            count+=sum;
        }
        return count;
    }
}