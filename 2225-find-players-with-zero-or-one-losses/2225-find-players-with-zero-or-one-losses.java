class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] m : matches) {
            if(map.containsKey(m[1])) {
                map.put(m[1],map.get(m[1])+1);
            } else {
                map.put(m[1],1);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> list2 = new ArrayList<>();
        for(int[] m : matches) {
            if(!map.containsKey(m[0])) {
                set.add(m[0]);
            }
        }
        for(int v : set) list1.add(v);
        for(int k : map.keySet()) {
            if(map.get(k)==1) {
                list2.add(k);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        list.add(list1);
        list.add(list2);
        return list;
    }
}