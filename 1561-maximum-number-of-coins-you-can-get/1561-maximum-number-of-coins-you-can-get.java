class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0;
        List<Integer> list = new ArrayList<>();
        for(int i=piles.length-1;i>=0;i--){
            if(i-1>=0)
                list.add(piles[i-1]);
            i--;
        }
        int nums=piles.length/3;
        for(int i=0;i<nums;i++){
            ans+=list.get(i);
        }
        return ans;
    }
}