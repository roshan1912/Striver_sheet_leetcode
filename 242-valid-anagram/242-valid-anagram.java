class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        // Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)-1);
        }
        for(char c:map1.keySet()){
            if(map1.get(c)!=0)
                return false;
        }
        return true;
    }
}