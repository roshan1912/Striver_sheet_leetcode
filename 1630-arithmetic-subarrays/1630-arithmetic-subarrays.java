class Solution {
    public boolean check(List<Integer> temp){
        Collections.sort(temp);
        int val = temp.get(1)-temp.get(0);
        for(int t=0;t<temp.size()-1;t++){
            if(temp.get(t+1)-temp.get(t) != val){
                return false;
            }
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<r.length;i++ ){
            int left = l[i];
            int right = r[i];
            List<Integer> temp = new ArrayList<>();
            for(int j=left;j<=right;j++){
                temp.add(nums[j]);
            }
            boolean put = check(temp);
            list.add(put);
        }
        return list;
    }
}