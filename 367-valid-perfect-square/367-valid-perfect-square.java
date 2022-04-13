class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = 46340;
        int mid = 0;
        while(low <= high){
            mid = low + ( ( high - low ) / 2 );
            if ( num == mid * mid )
                return true;
            else if ( num > mid * mid ) 
                low = mid + 1;
            else if ( num < mid * mid )
                high = mid - 1;
        }
        return false;
    }
}