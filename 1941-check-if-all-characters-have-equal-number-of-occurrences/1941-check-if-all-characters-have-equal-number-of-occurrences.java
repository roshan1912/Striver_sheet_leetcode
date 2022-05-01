class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(map.containsKey(c)){
                int of = map.get(c);
                map.put(c,of+1);
            }else{
                 map.put(c,1);
            }
        }
        List<Character> list = new ArrayList<>(map.keySet());
        char var = list.get(0);
        int f = map.get(var);
        // System.out.println(f);
        for(char ch:list){
            if(map.get(ch)!=f)
                return false;
        }
        return true;
    }
}