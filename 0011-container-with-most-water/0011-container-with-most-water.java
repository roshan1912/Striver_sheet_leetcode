class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int s=0;
        int end=height.length-1;
        while(s<end){
            if(height[s]<height[end]){
                ans=Math.max(ans,height[s]*(end-s));
                s++;
            }
            else{
                ans=Math.max(ans,height[end]*(end-s));
                end--;
            }
        }
        return ans;
    }
}