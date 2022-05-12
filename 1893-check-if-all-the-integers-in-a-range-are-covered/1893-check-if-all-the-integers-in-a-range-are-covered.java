class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int arr[]=new int[52];
        for(int i=0;i<ranges.length;i++){
            int start=ranges[i][0];
            int end=ranges[i][1];
            for(int k=start;k<=end;k++){
                ++arr[k];
            }
        }
        for(int i=left;i<=right;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
}