class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c) && map.get(c)>=1){
                int of = map.get(c);
                map.put(c,of-1);
            }else{
                count++;
            }
        }
        return count;
    }
}