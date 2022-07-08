class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0;i<logs.length;i++){
            int key=logs[i][0];
            int val=logs[i][1];
            Set<Integer> set = new HashSet<>();
            if(map.containsKey(key)){
                set = map.get(key);
            }
            set.add(val);
            map.put(key,set);
        }
        System.out.println(map);
        for(int id:map.keySet()){
             int val=map.get(id).size();
             ans[val-1]++;  
        }
        return ans;
    }
}