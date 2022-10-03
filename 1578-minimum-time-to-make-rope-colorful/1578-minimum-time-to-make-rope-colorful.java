class Solution {
    public int minCost(String colors, int[] neededTime) {
        int mintime=0;
        int i=0;
        int j=0;
        int n = colors.length();
        while(i<n && j<n){
            int sum =0;
            int max=0;
            while(j<n && colors.charAt(i)==colors.charAt(j)){
                max = Math.max(max,neededTime[j]);
                sum += neededTime[j];
                j++;
            }
            i = j;
            mintime += (sum-max);
        }
        return mintime;
    }
}