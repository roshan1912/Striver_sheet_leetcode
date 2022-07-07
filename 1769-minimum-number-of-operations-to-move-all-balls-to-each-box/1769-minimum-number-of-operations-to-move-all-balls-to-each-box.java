class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int moves=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    int val = Math.abs(j-i);
                    moves += val;
                }
            }
            ans[i]=moves;
            // moves=0;
        }
        return ans;
    }
}