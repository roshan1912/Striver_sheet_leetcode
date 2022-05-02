class Solution {
    public void recurPerm(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            recurPerm(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPerm(0,nums,ans);
        return ans;
    }
}