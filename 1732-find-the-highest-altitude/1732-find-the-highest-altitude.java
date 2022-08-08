class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length+1];
        for(int i=1;i<gain.length+1;i++){
            ans[i] = ans[i-1]+gain[i-1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max)
                max=ans[i];
        }
        return max;
    }
}