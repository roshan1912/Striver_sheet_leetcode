class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int len = ans.length()-1;
            if( len >= 0 && Math.abs(ch - ans.charAt(len)) == 32){
                ans.deleteCharAt(len);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}