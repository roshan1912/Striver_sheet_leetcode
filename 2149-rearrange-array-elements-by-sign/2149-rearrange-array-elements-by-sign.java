class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int neg1=0;
        int pos1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[neg1++]=(nums[i]);
            }else{
                pos[pos1++]=(nums[i]);
            }
        }
        int neg2=0;
        int pos2=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=pos[pos2++];
            }else{
                ans[i]=neg[neg2++];
            }
        }
        return ans;
    }
}