class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }
        for(int i=97;i<=122;i++){
            if(!map.containsKey((char)i))
                return false;
        }
        return true;
    }
}