class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (!map.containsKey(key)) {
                return key;
            }
            else if (map.get(key) == 0) {
                return key;
            }
            else {
                map.put(key, map.get(key) - 1);
            }
        }
        return 'n';
    }
}