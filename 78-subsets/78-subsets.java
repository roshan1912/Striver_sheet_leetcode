class Solution {
    public void Solve(int[] nums,List<Integer> output,int index,List<List<Integer>> result){
        result.add(output);
        for(int i=index;i<nums.length;i++){
            List<Integer> temp = new ArrayList<>(output);
            temp.add(nums[i]);
            Solve(nums,temp,i+1,result);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int index=0;
        Solve(nums,new ArrayList<>(),index,result);
        return result;
    }
}