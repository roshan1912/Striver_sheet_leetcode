class Solution {
    List<List<Integer>> ans;
    private void backtrack(int k, int n, int i, List<Integer> val){
        
        if(k == 0 && n == 0){
            ans.add(val);
            return;
        }
        if(k < 0 || n < 0)
            return;
        
        for(; i <= 9; i++){
            val.add(i);
            backtrack(k-1, n-i, i+1, new ArrayList<>(val));
            val.remove(val.size()-1); //Backtrack
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
         ans = new ArrayList<>();
        
        if(k >= n)
            return ans;
        
        backtrack(k, n, 1, new ArrayList<>());
        return ans;
    }
}