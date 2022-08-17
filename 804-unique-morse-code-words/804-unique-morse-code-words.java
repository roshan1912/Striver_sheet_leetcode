class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []codeTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
       HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<words.length; i++)
        {
            String word = words[i], morseCode = "";
            
            for(int j=0; j<word.length(); j++)
            {
                char letter = word.charAt(j);
                
                morseCode += codeTable[letter-'a'];
            }
            
            hm.put(morseCode, hm.getOrDefault(morseCode,0)+1);
        }
        
        return hm.size();
    }
}