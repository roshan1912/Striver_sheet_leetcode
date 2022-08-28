class Solution {
    public boolean Solve(int[] nums ,int half){
        boolean res[][] = new boolean[nums.length+1][half+1];
        for(int i=0;i<=nums.length;i++){
            res[i][0]=true;
        }
        for(int i=0;i<=half;i++){
            res[0][i]=false;
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=1;j<=half;j++){
                if(j>=nums[i-1])
                    res[i][j] = res[i-1][j-nums[i-1]] || res[i-1][j];
                else
                    res[i][j] = res[i-1][j];
            }
        }
        return res[nums.length][half];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int s = sum/2;
        if(sum%2!=0) return false;
        return Solve(nums,s);
    }
}