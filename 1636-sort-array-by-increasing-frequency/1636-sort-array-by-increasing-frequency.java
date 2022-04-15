class Solution {
    public int[] frequencySort(int[] nums) {
        int[] list1 = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            return (map.get(a) == map.get(b))? b - a : map.get(a) - map.get(b);
        });
        
        int i = 0;
        for (int num : list) {
            for (int j = 0; j < map.get(num); j++) {
                list1[i++] = num;
            }
        }
        return list1;
    }
}