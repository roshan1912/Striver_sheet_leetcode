class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m1=new HashMap<>();
        int max=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(!m1.containsKey(c))
                m1.put(c,i);
            else{
                i=m1.get(c);
                m1.clear();
            } 
            if(m1.size()>max){
                max=m1.size();
            }
        }
        return max;
    }
}