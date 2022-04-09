class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int i=0, j=0;
        int len=0;
        while(j<s.length())
        {
            if(m.containsKey(s.charAt(j)))
                i = Math.max(m.get(s.charAt(j)) + 1, i);
            m.put(s.charAt(j), j);
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }
}