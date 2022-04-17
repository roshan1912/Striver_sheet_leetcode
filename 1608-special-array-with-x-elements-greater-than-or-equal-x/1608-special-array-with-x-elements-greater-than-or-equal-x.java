class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] counter = new int[n+1];
        for(int item:nums){
            if(item>=n)
                counter[n]++;
            else
                counter[item]++;
        }
        int res=0;
        for(int j=counter.length-1;j>=0;j--){
            res+=counter[j];
            if(res==j)
                return j;
        }
        return -1;
    }
}