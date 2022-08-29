class Solution {
    public String decodeMessage(String key, String message) {
        key=key.replaceAll(" ", "");
        Map<Character,Character> map = new HashMap<>();
        char og='a';
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,og++);
            }
            if(og>'z') og='a';
        }
        // System.out.println(map);
        for(int i=0;i<message.length();i++){
            char c = message.charAt(i);
            if(c==' '){
                ans.append(" ");
            }
            else{
                ans.append(map.get(c));
            }
        }
        return ans.toString();
    }
}