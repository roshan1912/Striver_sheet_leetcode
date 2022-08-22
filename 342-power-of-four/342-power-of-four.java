class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        double p = Math.log(n)/Math.log(4);
        boolean res = Math.ceil(p)==Math.floor(p);
        return res;
    }
}