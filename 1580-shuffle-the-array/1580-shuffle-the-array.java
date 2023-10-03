class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i=0;i<n;i++){
            x.add(nums[i]);
        }
        for(int j=n;j<nums.length;j++){
            y.add(nums[j]);
        }
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        for(int m=x.size()-1;m>=0;m--){
            stk1.push(x.get(m));
        }
        for(int k=y.size()-1;k>=0;k--){
            stk2.push(y.get(k));
        }
        for(int l=0;l<nums.length;l++){
            if(l%2==0)
                ans[l]=stk1.pop();
            else
                ans[l]=stk2.pop();
        }
        return ans;
    }
}