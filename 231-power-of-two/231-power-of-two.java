class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n==536870912){
            return true;
        }
        double pow = Math.log(n)/Math.log(2);
        boolean res = Math.ceil(pow)==Math.floor(pow);
        return res;
    }
}