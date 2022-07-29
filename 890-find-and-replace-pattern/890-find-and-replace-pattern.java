class Solution {
    public boolean hasPattern(String s, String pattern){
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> rmap = new HashMap<>();
        for(int i=0; i<s.length(); ++i){
            char c = s.charAt(i);
            char p = pattern.charAt(i);
            if(map.containsKey(p) && map.get(p)!=c) return false;
            map.put(p, c);
            if(rmap.containsKey(c) && rmap.get(c)!=p) return false;
            rmap.put(c, p);
        }
        
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String s: words){
            if(hasPattern(s, pattern)){
                res.add(s);
            }
        }
        return res;
    }
}