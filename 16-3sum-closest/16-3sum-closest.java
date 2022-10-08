class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int closest =Integer.MAX_VALUE;
        int n=  nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int curr = nums[i]+nums[l]+nums[r];
                if(curr==target)
                    return curr;
                if(Math.abs(target-curr)<closest){
                    closest=Math.abs(target-curr);
                    res=curr;
                }
                if(curr<target)
                    l++;
                if(curr>target)
                    r--;
            }
        }
        return res;
    }
}