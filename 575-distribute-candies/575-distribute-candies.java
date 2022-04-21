class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int item:candyType){
            if(map.containsKey(item)){
                int of = map.get(item);
                map.put(item,of+1);
            }
            map.put(item,1);
        }
        int val=0;
        int n=candyType.length/2;
        int size = map.size();
        if(size==n){
            return n;
        }else{
             val=Math.min(n,size);
        }
        return val;
    }
}