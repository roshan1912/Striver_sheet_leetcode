class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            s.add(candyType[i]);
        }
        int t=candyType.length/2;
        if(t>s.size()){
            return s.size();
        }
        return t;
    }
}