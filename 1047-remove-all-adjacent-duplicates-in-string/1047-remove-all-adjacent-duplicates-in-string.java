class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int len = ans.length()-1;
            if(len>=0 && ans.charAt(len)-s.charAt(i)==0){
                ans.deleteCharAt(len);
            }
            else
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}