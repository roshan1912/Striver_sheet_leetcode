class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int major=0;
        for(int item:nums){
            if(count==0){
                count++;
                major=item;
            }else if(major==item){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}