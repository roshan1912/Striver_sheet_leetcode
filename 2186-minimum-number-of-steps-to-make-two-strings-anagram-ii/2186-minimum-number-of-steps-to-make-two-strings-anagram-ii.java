class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        int count=0;
        for(char c:map.keySet()){
            if(map.get(c)!=0){
                int val = Math.abs(map.get(c));
                count += val;
            }
        }
        return count;
    }
}