class Solution {
    public boolean digitCount(String num) {
        Boolean ans = true;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(int i=0;i<num.length();i++){
            int val = Character.getNumericValue(num.charAt(i));
            char c = Character.forDigit(i, 10);
            if(map.containsKey(c)){
                if(val!=map.get(c))
                    return false;
            }
            else if(num.charAt(i)!='0')
                return false;
        }
        return true;
    }
}